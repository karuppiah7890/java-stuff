* How to start off a gradle project
with junit and hamcrest in build.gradle
which can run tests?

Able to start a project with gradle using
gradle init.

```bash
$ brew install gradle
$ gradle --version

------------------------------------------------------------
Gradle 6.5.1
------------------------------------------------------------

Build time:   2020-06-30 06:32:47 UTC
Revision:     66bc713f7169626a7f0134bf452abde51550ea0a

Kotlin:       1.3.72
Groovy:       2.5.11
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          14.0.1 (Oracle Corporation 14.0.1+14)
OS:           Mac OS X 10.15.5 x86_64
```

Options to choose - 
* type: application / library. as basic has no 
files.
* implementation language - Java
* DSL - Groovy. Ask them to explore. Tell
full form may be?
* Testing - Junit Jupiter (version 5)

```bash
$ gradle init

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Swift
Enter selection (default: Java) [1..5] 3

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter
Enter selection (default: JUnit 4) [1..4] 4

Project name (default: demo-6):
Source package (default: demo):

> Task :init
Get more help with your project: https://docs.gradle.org/6.5.1/userguide/tutorial_java_projects.html

BUILD SUCCESSFUL in 28s
2 actionable tasks: 2 executed

$ # to do everything completely in
$ # the command line, go ahead. or
$ # do it in IDE. it will work either way!

$ gradle tasks

> Task :tasks

------------------------------------------------------------
Tasks runnable from root project
------------------------------------------------------------

Application tasks
-----------------
run - Runs this project as a JVM application

Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Distribution tasks
------------------
assembleDist - Assembles the main distributions
distTar - Bundles the project as a distribution.
distZip - Bundles the project as a distribution.
installDist - Installs the project as a distribution as-is.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'demo-6'.
components - Displays the components produced by root project 'demo-6'. [incubating]
dependencies - Displays all dependencies declared in root project 'demo-6'.
dependencyInsight - Displays the insight into a specific dependency in root project 'demo-6'.
dependentComponents - Displays the dependent components of components in root project 'demo-6'. [incubating]
help - Displays a help message.
model - Displays the configuration model of root project 'demo-6'. [incubating]
outgoingVariants - Displays the outgoing variants of root project 'demo-6'.
projects - Displays the sub-projects of root project 'demo-6'.
properties - Displays the properties of root project 'demo-6'.
tasks - Displays the tasks runnable from root project 'demo-6'.

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

To see all tasks and more detail, run gradle tasks --all

To see more detail about a task, run gradle help --task <task>

BUILD SUCCESSFUL in 605ms
1 actionable task: 1 executed

$ gradle test

BUILD SUCCESSFUL in 3s
3 actionable tasks: 3 executed
```

IntelliJ stuff - 
Check Java version. What version do we want?
Latest seems to be version v14.x . IntelliJ
tells it gets the JDK from Oracle OpenJDK.
There are others too. When starting the project,
we are able to choose and also download 
different versions of JDK

Use test-machine-setup repo to make sure 
everything works

For gradle to work, gradle plugin should be
enabled

For Junit to work, Junit plugin needs to
be enabled so that you can switch between
the Junit tests and also run the tests with
shortcuts or clicking play buttons. Or else
tests will not be understood and treated
as tests

IntelliJ stores the version of Java in
the .idea/misc.xml file

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ExternalStorageConfigurationManager" enabled="true" />
  <component name="ProjectRootManager" version="2" project-jdk-name="14" project-jdk-type="JavaSDK" />
</project>
```

Check the `project-jdk-name` and fix it
correctly

The Java version can also be checked in
the Project Structure `Command + ;` or
`File > Project Structure...` and then
under `Project Settings` choose `Project`
and under `Project SDK` choose the appropriate
SDK version

Initially, when openining the project with
IntelliJ, it will download stuff, like
gradle (based on gradle version) and then
download dependencies - Junit Jupiter and all.
Once it's done, it will automatically run the
build and show the build is a success. 

You can then run tests in IntelliJ and make
sure it's passing

* Value Objects

* equals and hashCode

* Enum Classes

* Guard Clauses

* Object Calisthenics. Hard rules? No. There
are exceptions to it, clear ones, where the
rules are avoided to make readability better



