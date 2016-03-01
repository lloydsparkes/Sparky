using Antlr4.Runtime;
using Sparky.Model;
using Sparky.Model.Builder;
using Sparky.Parser;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sparky
{
    public class ConfigurationBuilder
    {
        private List<string> _files = new List<string>();
        private List<string> _directories = new List<string>();
        
        public ConfigurationBuilder WithFile(string file)
        {
            _files.Add(file);
            return this;
        }
        
        public ConfigurationBuilder WithDirectory(string directory)
        {
            _directories.Add(directory);
            return this;
        }

        public IConfiguration Build()
        {
            //1. Build file list
            List<string> files = new List<string>();
            foreach(string dir in _directories)
            {
                if (Directory.Exists(dir))
                {
                    foreach(var file in Directory.EnumerateFiles(dir))
                    {
                        files.Add(file);
                    }
                }
                else
                {
                    //TODO: Throw reasonable exception / Logging
                }
            }

            var builder = new BlockBuilder();

            files.AddRange(_files);
            foreach(var file in files)
            {
                if (!File.Exists(file))
                {
                    //TODO: Throw reasonable exception / Logging
                }
                else
                {
                    LoadFile(builder, file);
                }
            }

            return new Configuration(builder.Build(null));
        }

        private void LoadFile(BlockBuilder builder, string file)
        {
            using (var raw = new StreamReader(file))
            {
                var fs = new AntlrInputStream(raw);

                var lexer = new SparkyLexerFixed(fs);
                var cts = new CommonTokenStream(lexer);
                var parser = new SparkyParser(cts);

                var visitor = new SparkyVisitor(builder);
                var rootBlock = visitor.Visit(parser.config()) as BlockBuilder;
            }
        }
    }
}
