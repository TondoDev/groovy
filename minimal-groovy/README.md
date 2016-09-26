minimal-groovy
==============

Maven minimal groovy project skeleton.

## POM configuration ##

We need provide dependency to:
```xml
<groupId>org.codehaus.groovy</groupId>
<artifactId>groovy-all</artifactId>
<!-- any version of Groovy \>= 1.8.2 should work here -->
```
which brings all needed groovy libraries

For building we use **GMavenPlus** plugin with following configuration
```xml
<plugin>
  <groupId>org.codehaus.gmavenplus</groupId>
  <artifactId>gmavenplus-plugin</artifactId>
  <version>1.5</version>
  <executions>
    <execution>
      <goals>
        <goal>addSources</goal>
        <goal>addTestSources</goal>
        <goal>generateStubs</goal>
        <goal>compile</goal>
        <goal>testGenerateStubs</goal>
        <goal>testCompile</goal>
        <goal>removeStubs</goal>
        <goal>removeTestStubs</goal>
      </goals>
    </execution>
  </executions>
</plugin>
```
**addSource** and **addTestSource** are bound to *initialization* phase of default
lifecycle make groovy sources accessible for generation of source and test JARs.

**generateStubs**  goal is bound to *generate-sources* phase and creates java source from groovy sources and add them
to Maven's main sources for compilations. Used when groovy is mixed with java.

**compile** goal is bound to *compile* phase and complile groovy code

**testGenerateStubs** (*generate-test-sources* phase) and **testCompile**  (*test-compile* phase) accomplish same for groovy test classes

**removeStubs** and **removeTestStubs** - remove generated stups for main code and tests.
This prevents generated code to appear in  source JARs

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
