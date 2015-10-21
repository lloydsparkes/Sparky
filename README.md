# Sparky - A Configuration Language

### License

MIT - see the License file

## Example

    # This is a comment within a configuration file
	# This configuration file details our database connection details
	database:
		server:
			[ ${env} = ${ENV} ][ ${site} = ${SITE} ]
			/ env		/ site		/ right 	/ host					/ username			/ password
			| dev		| ln		| read		| ldndevx1.internal		| reader			| Password1
			| dev		| ln		| write		| ldndevx1.internal		| writer			| Password1
			| qa		| ln		| read		| ldnqax1.internal		| reader			| Password1
			| qa		| ln		| write		| ldnqax1.internal		| writer			| Password1
			| prod		| ln		| read		| ldnprodx1.internal	| reader			| Password1
			| prod		| ln		| write		| ldnprodx1.internal	| writer			| Password1

			${right}:
				connectionString=jdbc://${username}:${password}@${host}/

The configuration file above will produce the following once compiled.

	# Given ENV = dev and SITE = ln
	database.server.read=jdbc://reader:Password1@ldndevx1.internal/
	database.server.write=jdbc://writer:Password1@ldndevx1.internal/

## Goals

* To simplify configuration within projects
	* Why have multiple <name>-<environment>.property files, if you can have one which has everything in it, and just compiles down to what you want
* To enable more complex configuration while maintaining readability

## Target Platforms & Tools

* Java
	* This is the initial platform because of the decision to use ANTLR
* C#
* C / C++
* Any other platforms that come along (Go, JavaScript??)

For each platform we aim to provide

* Configuration Compiler, that produces a simple properties file (path.to.key=value) for distribution
	* For platforms that require it, a runtime library to utilise such a file
	* For where the configuration will be deployed as part of the project
* Runtime Compiler - which takes the raw input at runtime an uses it directly
	* For where the configuration is deployed everywhere and projects can pick it up from a well known location
* A configuration checker which allows you to validate a set of configuration against a schema

# Syntax Definition

You can find it in the Wiki here:

https://github.com/lloydsparkes/Sparky/wiki/Language-Definition

