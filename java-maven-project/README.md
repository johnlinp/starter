# Java Maven Project

First, set these variables in command line:

```
$ GROUP_ID=io.github.johnlinp
$ ARTIFACT_ID=foo-project
```

Then, type this command:

```
$ mvn archetype:generate \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false \
    -DgroupId=$GROUP_ID \
    -DartifactId=$ARTIFACT_ID
```
