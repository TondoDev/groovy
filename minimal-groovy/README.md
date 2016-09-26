minimal-groovy
==============

Maven minimal groovy project skeleton.

## Running JARs ##
```
 java -cp ./application.jar:$GROOVY_HOME/embeddable/groovy-all-2.4.7.jar <main class FQN>
```

When **main class** is specified in JAR manifest file FQN can be omitted.
When class path is specified in manifest with main class, then we can run it by `java -jar`
command.

We can run compiled application without packaging step executed with **maven exec plugin**.
We can specify main class as plugin argument:
```
mvn exec:java -Dexec.mainClass="main class FQN"
```
or we can setup this plugin in *pom.xml*:
```xml
<plugin>
  <groupId>org.codehaus.mojo</groupId>
  <artifactId>exec-maven-plugin</artifactId>
  <version>1.5.0</version>
  <executions>
    <execution>
      <goals>
        <goal>java</goal>
      </goals>
    </execution>
  </executions>
  <configuration>
    <mainClass>org.tondo.ibang.Main</mainClass>
  </configuration>
</plugin>
```
and run application just by type `mvn exec:java`
