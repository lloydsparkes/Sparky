mkdir tmp
copy ..\grammar\Sparky.g4 tmp\Sparky.g4
call antlr tmp\Sparky.g4
copy tmp\*.java src\
javac -d .\target .\src\*
rd /s /q tmp