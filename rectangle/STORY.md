# Story

I've started off the project with `gradle init`

```bash
gradle init
Starting a Gradle Daemon (subsequent builds will be faster)

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 3

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 3

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

Project name (default: rectangle):
Source package (default: rectangle):

> Task :init
Get more help with your project: https://docs.gradle.org/6.5.1/userguide/java_library_plugin.html

BUILD SUCCESSFUL in 27s
2 actionable tasks: 2 executed
```

```bash
$ ./gradlew tasks

> Task :tasks

------------------------------------------------------------
Tasks runnable from root project
------------------------------------------------------------

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

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'rectangle'.
components - Displays the components produced by root project 'rectangle'. [incubating]
dependencies - Displays all dependencies declared in root project 'rectangle'.
dependencyInsight - Displays the insight into a specific dependency in root project 'rectangle'.
dependentComponents - Displays the dependent components of components in root project 'rectangle'. [incubating]
help - Displays a help message.
model - Displays the configuration model of root project 'rectangle'. [incubating]
outgoingVariants - Displays the outgoing variants of root project 'rectangle'.
projects - Displays the sub-projects of root project 'rectangle'.
properties - Displays the properties of root project 'rectangle'.
tasks - Displays the tasks runnable from root project 'rectangle'.

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

To see all tasks and more detail, run gradlew tasks --all

To see more detail about a task, run gradlew help --task <task>

BUILD SUCCESSFUL in 609ms
1 actionable task: 1 executed
```


```bash
$ ./gradlew check

BUILD SUCCESSFUL in 3s
3 actionable tasks: 3 executed

$ ./gradlew build

BUILD SUCCESSFUL in 825ms
4 actionable tasks: 1 executed, 3 up-to-date

$ ./gradlew test

BUILD SUCCESSFUL in 707ms
3 actionable tasks: 3 up-to-date
```

