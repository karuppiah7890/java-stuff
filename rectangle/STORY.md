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

I was reading the four rules of simple design
here

https://martinfowler.com/bliki/BeckDesignRules.html

* Passes the tests
* Reveals intention
* No duplication
* Fewest elements

By getting lost on the Internet of links

https://blog.jbrains.ca/permalink/the-four-elements-of-simple-design

The method name for getting area is `area`. Let's see
what other names I can think of or have seen:

* areaOfRectangle
* getArea
* calculateArea
* calculateAndGetArea
* calculateAndGiveArea
* giveArea
* calculateAreaOfRectangle
* calculateRectangleArea
* area

Now let's think about these names for a moment.
The name `areaOfRectangle` has the word `Rectangle`
which is a bit redundant in the sense that the method
in itself is present in a class named `Rectangle`,
so, it's not necessary, and we can avoid words like
`Of`. 

Next, the name `getArea`, it kind of implies
that you are getting something - does it mean
you have already calculated the area and are just
getting it now? Also, isn't `get` a bit redundant because
the contract of the method also clearly shows that
the method returns something, which for the client means -
it's getting something, so `get` word becomes
unnecessary.

Next, the name `calculateArea` tells
a bit about the implementation of the method - which
is that, it calculates the area when the client
calls the method. What happens if tomorrow you want to
calculate the area during object creation, in the
constructor and store it in one of the fields and
just return it when `calculateArea` is called?
At that point your method name wouldn't make sense, 
and you would have to change it, and changing
method names which are part of a public API is
a breaking change for the clients which is frowned
upon unless extremely needed and one would have to
bump up the major version of their software if they
are using semantic versioning (semver.org). As
we can see, adding implementation details to the
method name can make change a bit harder. It's
also better to hide implementation details from the
client as the client does not care about implementation
and is looking for results. 

Similar things can be said about the names
`calculateAndGetArea`, `calculateAndGiveArea`,
`giveArea`, `calculateAreaOfRectangle`,
`calculateRectangleArea` to reason out that they
aren't that great. 

Finally, the name `area`. It is quite simple and
does not have the issues that were mentioned
previously and shows intent quite well, respecting
one of the 4 rules of simple design.

Some more reading that I did

https://blog.thecodewhisperer.com/permalink/a-model-for-improving-names

https://www.digdeeproots.com/articles/on/naming-as-a-process/ :
  - https://www.digdeeproots.com/articles/naming-as-a-process/
  - https://www.digdeeproots.com/articles/get-to-obvious-nonsense/    

There are more articles in the series, but I'm going
to read them later as this is digging more deep into
naming, and I'm trying to get some breadth here first.

Next I'm adding the perimeter method and adding tests for it!


