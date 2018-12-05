# CAT01

A remake of a game I started when I was in college. I lost all of my files from that time, and because of that I completely forget the idea of finishing it. But I want to finish this one, so I start again from sratch and gonna build everything better that I did before. Gonna take some time though.

## INSTALLATION

?
## CREATE PACKAGE

First, you have to compile all the file of src to the run directory :
```
javac -classpath ./src/ -d ./run/ ./src/*/*.java
```

Then, you have to create the jar. So we have to run this command :
```
cp -r src/assets/ run/ && cd run && jar -cvfm test.jar META-INF/MANIFEST.MF *
```

Finally, you can run the jar for testing of everything is OK :
```
java -jar test.jar && chmod +x test.jar
```

## RUNNING

?

## ERRORS

When trying to run the jar executable :
```
The file '/home/rumarocket/eclipse-workspace-java/Cat01/run/test.jar' is not marked as executable.  If this was downloaded or copied from an untrusted source, it may be dangerous to run.  For more details, read about the executable bit.
```
Simply means that the file is not an executable, so you have to setting the property of the file as an excutable file.