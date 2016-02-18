using System;
using System.IO;
using NUnit.Framework;
using System.Collections.Generic;
using Sparky.Model;
using Antlr4.Runtime;
using Sparky.Parser;
using Sparky.Model.Builder;

namespace Sparky.Tests
{
    [TestFixture]
    public class SparkyDynamicTest
    {
        [Test, TestCaseSource(typeof(TestFactory), "TestCases")]
        public void TestFileAgainstExpectations(string file)
        {
            var config = LoadConfiguration(file);
            var expectations = LoadExpectations(file);

            foreach(var externSet in expectations.Keys)
            {
                var tests = expectations[externSet];

                foreach(var ex in externSet)
                {
                    config.SetExternal(ex.Key, ex.Value);
                }

                foreach(var test in tests)
                {
                    Assert.AreEqual(test.Value, config.Resolve(test.Key));
                }
            }
        }

        private IConfiguration LoadConfiguration(string file)
        {
            using(var raw = new StreamReader(file))
            {
                var fs = new AntlrInputStream(raw);

                var lexer = new SparkyLexerFixed(fs);
                var cts = new CommonTokenStream(lexer);
                var parser = new SparkyParser(cts);

                var visitor = new SparkyVisitor();
                var rootBlock = visitor.Visit(parser.config()) as BlockBuilder;

                return new Configuration(rootBlock.Build(null));
            }
            
        }

        private IDictionary<List<KeyValuePair<string, string>>, List<KeyValuePair<string, string>>> LoadExpectations(string file)
        {
            var expectations = new Dictionary<List<KeyValuePair<string, string>>, List<KeyValuePair<string, string>>>();

            var lines = File.ReadAllLines(file + ".expectations");

            var externs = new List<KeyValuePair<string, string>>();
            var expects = new List<KeyValuePair<string, string>>();

            foreach (var line in lines)
            {
                if (line.StartsWith("WHEN:"))
                {
                    if(expects.Count > 0)
                    {
                        expectations.Add(externs, expects);
                        externs = new List<KeyValuePair<string, string>>();
                        expects = new List<KeyValuePair<string, string>>();
                    }
                    var bits = line.Replace("WHEN:", "").Split('=');
                    externs.Add(new KeyValuePair<string, string>(bits[0], bits[1]));
                }
                else if (!string.IsNullOrWhiteSpace(line))
                {
                    var bits = line.Split('=');
                    expects.Add(new KeyValuePair<string, string>(bits[0], bits[1]));
                }
            }
            expectations.Add(externs, expects);

            return expectations;
        }
    }

    public class TestFactory
    {
        public static readonly string basePath = @"D:\Projects\Sparky\examples";

        public static IEnumerable<TestCaseData> TestCases
        {
            get
            {
                IEnumerable<string> files = Directory.EnumerateFiles(basePath);
                foreach(var f in files)
                {
                    if (!f.Contains(".expectations"))
                    {
                        var td = new TestCaseData(Path.Combine(basePath, f));
                        td.SetName(string.Format("ConfigurationTest_{0}", f));
                        yield return td;
                    }
                }
            }
        }
    }
}
