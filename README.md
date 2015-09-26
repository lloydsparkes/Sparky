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

# Syntax

**TODO:**

* Write improve this with more and better examples. 
* Link to examples. 
* Link to formal Specification
* Ensure all documented features actually exist and work

## Files

* Currently only one file is supported at a time. 
* Plans are to support multiple files.

## Comments

* There are only line comments
* Line comments MUST being with a '#'
* A comment will take up the rest of the line. It is not possible to close the comment

## Blocks

A block is a grouping of configuration options (rules, nested blocks, tables). It has a name, which combined with the blocks above it, provide a path to the options contained below.

Blocks can be nested forever (theoretically).

* A block's full name can only be defined once.
* A block's name MUST start with a letter, and MUST only contain alphanumeric characters
* A block's name CAN be a variable (as long as the rules above are obeyed for what the variable evaluated to)
* A block MUST have at least a rule under it OR another block
* A block MUST contain more than ONE table

**Examples:**

	# This is a simple block. Its name is database.
	database:
		# This is a nested block, its relative name is 'server' but its full name is 'database.server'
		server:
			# This is a third nested block, its relative name is 'test' its full name is 'database.server.test'
			test:
				key=value
		
		# This is another block
		connections:

		# This is an illegal block - it full name has already been created
		server:
			key=value 

		${sometablefield}:
			key=value

		# This block is illegal - 
		emptyblock:

## Rules

A rule is a key value pair under a block.

* A rule's name MUST start with a letter, and MUST only contain alphanumeric characters
* A rule's name CAN be a variable (as long as the rules above are obeyed for what the variable evaluated to)
	* A rule's name cannot be the indexer variable ('$$')
	* *This is not supported yet actually*
* A value can be ANY string, which will be trimmed, and must end at the end of the line.
	* If a string has '${' anywhere in it, it will be treated as having a variable in it, and will be treated as an expression
	* Anything after a '#' will be treated as a comment
* A value can be an expression
	* An expression is a string which contains variables, which will be evaluated by the compiler

**Examples:**

	database:
		username=lloyd			# This is a simple rule, with a key of 'username' and value of 'lloyd'
		password=${password}	# This is a simple rule with an expression for a value.
 
		#This is a complex expression, the variables will be interopolated into the string
		hostname=jdbc://${username}:${password}@host.com/	

## Tables

Tables are a great way to provide a number of possible options, that can be reduced by filters

* Tables MUST be inside a block
* A block can may have NO tables OR ONE table.
* A table can only be accessed by its block, OR nested blocks
	* As long as the nested blocks DO NOT have their own table
* Tables can have multiple filters, BUT only one filter per a column is allowed
	* A filter removes all rows from the table where the filter DOES NOT MATCH
* Table columns can be accessed by their column name as variables
* A Table MUST have at least one COLUMN
* A Table can have any number of rows (includes 0, so no rows is allowed)
* You can iterate through rows using the '$$' variable

**Examples:**

	database:
		server:
			# If ENV was qa, then only the 2 QA rows would remain.
			# If ENV was dev, then only the 2 DEV rows would remain.
			# If SITE was ny, then no rows would be produced
			[ ${env} = ${ENV} ][ ${site} = ${SITE} ]
			/ env		/ site		/ right 	/ host					/ username			/ password
			#DEV Rows
			| dev		| ln		| read		| ldndevx1.internal		| reader			| Password1
			| dev		| ln		| write		| ldndevx1.internal		| writer			| Password1
			#QA Rows
			| qa		| ln		| read		| ldnqax1.internal		| reader			| Password1
			| qa		| ln		| write		| ldnqax1.internal		| writer			| Password1
			#PROD Rows
			| prod		| ln		| read		| ldnprodx1.internal	| reader			| Password1
			| prod		| ln		| write		| ldnprodx1.internal	| writer			| Password1

			# For each possible value in the right column, a new block will be generated 
			# (so a read and write block) will be generated
			${right}:
				# The values for username, password, and host are picked from the rows where right = ${right}
				connectionString=jdbc://${username}:${password}@${host}/

			# This will iterate through all rows in the filtered table, and will produce a block for each one
			$$:
				${right}=jdbc://${username}:${password}@${host}/

			# You do not have to create a block to iterate through rows, this will produce row id's as keys
			$$=${right}

## Variables

Variables are a way to access values from tables, other blocks or even from external sources.

* External variables name MUST be capitalised
	* ENV is external
	* env is internal
	* Env is internal
	* eNv is internal
* Any external variable may be referenced, BUT the compiler will fail if it is not provided at compile time
* Internal variable SHOULD be all lowercase
	* Mixed casing is allowed.
	* Variable names are case insensitive UNLESS they are fully capitalised.
		* eNv == env == Env == enV
		* ENV != env
* Variable names may contain a path to another block
	* database.server.read.connectionString is a valid variable name
* Variable names may contain a variable
	* database.server.${right}.connectionString is a valid variable name
		* IF ${right} resolves
	* Beware of creating impossible to resolve variable loops
				


