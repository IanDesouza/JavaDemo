# Notes

* Test Driven Development
* Advantages
    * Leads to better code coverage for tests
    * Leads to better designs
        * proper dependency injection
        * good system decomposition
* Process
    * Write the test first
    * The test will fail
    * Write just enough production code to make the test pass
    * Refactor the test to add another test
    * The test will fail
    * Refactor the production code to make the test pass
* Weakly type language (Javascript)
    * advantages
        * you can assign anything to a variable (var, let)
    * disadvantage
        * error may happen at runtime instead of compile time
* Strongly type language (Java, TypeScript (layer over JavaScript))
    * advantages
        * you know what the type is (helps developer keep track of the type)
        * compilation checks errors while developing
* Classes and Objects
    * objects are instances of classes
    * class is an abstraction
    * object is a concrete instance of the abstraction
    * construct object of a particular class
* Main types of languages
    * Object Oriented (Java)
        * later they added "lambda function"; similar to anonymous classes (functional object (interface with one
          method))
    * Functional (JavaScript)
    * Hybrids (JavaScript) 
* Scope
  * keywords
    * private
    * protected
    * public
    * (empty) (default scope)
  * purpose
    * encapsulation of the object
    * minimal surface area

## Branches
* Used in git (source code control) tool
* Exists in a repo (git repository)
* Integration of GitHub with IntelliJ
    * Git tool view
        * Commit code
            * pushes change to your code to the repo
                * select the files that were changed since last commit
                * comment is kept with the commit
                    * can be reviewed throughout future by anyone with access
                * in the editor of intelliJ, you'll see who made what change over the years

## Layers of software, languages
* CPU based layer in assembly
* 1rst 0,1
* 2nd Assembly
    * only talked to one CPU type
* 3rd Generate Languages
    * CPU neutral Turing complete
        * Java
        * C
        * Python
    * functions
    * types (weak vs strongly)
    * loops
    * if (criteria)

# Software Architecture
* UI
* Service
    * Client/Server
    * REST (synchronous)
        * (SpringBoot)
        * request/response
* MessageBus (asynchronous)
    * Hub/Spoke topology
    * Apache Kafka
        * emit events
        * consuming events

# Compilation
* x.java -> x.class (will run on any CPU but has to be run on the JVM for an OS)
* x.cpp -> x.o (will run only on one OS instruction set (Apple, Windows, Unix))

## Software stack; OS; CPU
* application code; Java Bytecode; networking
  * moved over to the web application model
* html/javascript/ajax <--> Server; 90+% linux
* Java Virtual Machine; program compiled on the CPU architecture
  * one for Apple, IBM PC, Linux, etc.
* OS; Windows, Mac, Linux
* CPU Architecture; 8086; ARM;

## Web Development
* always uses these for running in the browser
    * html
        * table
        * tr
        * th
        * td
        * ol
        * ul
        * li
    * javascript
        * runs in the browser
    * css
        * used in the browser to style the html
    * ajax
        * used to communicate with the server
* server
    * "cloud"
        * multi server to handle traffic
    * server side rendering languages (older tech)
        * php
        * java
        * velocity
    * modern web frameworks
        * framework
            * angular *
                * superset of javascript
                * examples later
                * what it does, advantages,
            * react
                * library
        * how do these framework work
            * own language
            * transpile
                * babel
                    * takes the framework language and transpiles that into html, javascript, css, ajax
    * good software principles
        * Separation of Concerns
            * https://en.wikipedia.org/wiki/Separation_of_concerns#:~:text=Separation%20of%20concerns%20is%20a%20form%20of%20abstraction.,reuse%20of%20more%20optimized%20code.

## Raspberry Pi 5
* https://www.amazon.com/Raspberry-Pi-Board-Heatsinks-4pcs/dp/B0CNXHL8W9/ref=asc_df_B0CNXHL8W9/?tag=hyprod-20&linkCode=df0&hvadid=693338329849&hvpos=&hvnetw=g&hvrand=5955639282031934512&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9026797&hvtargid=pla-2275819877899&mcid=86a4dc224176363691d7b068cde53567&gad_source=1&th=1

## UML
* Class diagrams
* Sequence diagrams
* State diagrams

## TDD (Test Driven Development/Design)
* Example in JavaDemo
    * MoneyTest
    * PercentageTest
    * DeductibleTest

## Languages
* Java (new bytecode running on a JVM, new garbage collection)
    * Application byte code
    * JVM
    * OS
    * Hardware
* Optimized Java
    * Application byte code
    * JVM
        * Java JIT (just in time compiler)
            * sped up runtime even faster
            * input was bytecode and output was native instruction set (for OS) only once, then cached
    * OS
    * Hardware
* Python
    * Application byte code
    * Python Virtual Machine
    * OS
    * Hardware
* C++ (new OO paradigm, issues with memory managements)

## Distributed applications
* Client and Server
* everything is over a socket (end to end communication)
    * TCP over IP
        * v4 (run out of numbers 2**32 possible machines)
            * classes A, B, C, D
            * 4 numbers
                * some of the numbers at the start designated a class of network
                * A.B.C.D
        * v6 (2**128 possible entities)
        * concept of well known ports
            * 80 HTTP
            * 21 FTP
* clients call server functions
    * parameters can be passed
    * uses the concept of marshalling values across the net
* protocols for interchanging data between client/server
    * binary
    * character based

| Decimal | Binary | Hexadecimal | 
|---------|-------:|-------------|
| 1       |      1 | 1           |
| 2       |     10 | 2           |
| 4       |    100 | 4           |
| 15      |   1111 | F           |
| 16      |  10000 | 10          |

## Internationalization
* ascii byte characters (0-255)
* double byte characters

## Library vs Framework
* Angular (framework)
    * 'Component' based
        * html aspect
        * stylesheet
        * component
            * decorators
                * @Component...
            * typescript logic
                * superset of javascript
            * directive, etc other structures

## Python
```python
a,b=0,1
while 1:print(a);a,b=b,a+b
```

## Java
* OO language
    * some support for lambda functions
        * implied interface with a single method override is a lambda function
    * class based (includes interfaces)
    * encapsulation
    * first primitive C++ basically compiled into C then to object code
    * class (also interfaces) has the following
        * data
            * encapsulated in the class
        * methods (function)
            * work on the data
            * ensure the data doesn't get corrupted and stays in a good state
            * prevents the outside world (client) from making mistakes in the class data
            * data members have a type
                * low level object types: String, Number,
                * other higher level class types (Person)
                * primitives
                    * boolean (1 byte) only value is true, false
                    * int (4 bytes or 32 bits) max value is 2**31-1, min is -2**31
                    * float (4 bytes or 32 bits) max value is 2**31 -1
                    * long (8 byte)
                    * double (8 byte)
                    * short (2 bytes)
                    * byte (1 byte (8 bits))
                    * arrays (fixed size array of anything); 0 based indexing
                        * int[] numbers = new int[100];
                        * numbers[0] = 42;
                        * Person[] people;
                * final: mean can't change in code after initialized
                * scope
                    * private
                        * only the class can have access to it
                    * protected
                        * only the class or subclasses can have access to it
                    * nothing (default scope)
                        * only the class or subclasses or other classes in the package can have access to it
                    * public
                        * any other class can have to access to it
                    * above scope types pertain to both data and methods
                * method member of class
                    * has scope
## Assignments
* Learning more about collection and using them?
    * TDD (test driven development)
        * write the test first
        * implement just enough production code to make it pass
        * write more tests
            * refactor production code
        * build up code coverage and validation of your code correctness
        * benefits the design; good separation of concerns comes out of it
    * Maven / Gradle
        * repo for various java libraries
        * gradle
            * build tool for pulling in libraries
            * building project
            * testing project
            * build.gradle file
    * Compilation vs Runtime dependencies
        * Compile Time
            * These are compile time references that your code uses
        * Runtime
            * These are runtime references that the library uses
    * More Java
        * classes
        * data members
        * encapsulation
            * record keyword for immutable classes
                * something doesn't accidentally change the state of your objects

## High level areas of computer science
* Neural network
    * neurons and training
    * language support
    * training data to build model (LLM)
    * model is trying to represent how
* Traditional Software development
* Patterns
* Software Principles / Applications
    * Separation of Concerns / dependency injection framework
        * Spring Boot
            * annotation how to apply to your classes you develop and plug into the spring boot framework
* Architectures
    * dependency injection (Spring)
        * allows for late binding of dependencies in your java classes
        * at runtime spring will find your dependency and plugin to your other higher level classes
  * Message Bus
      * Spring framework 
        * opinionated framework
        * annotate java classes with SpringBoot annotations
           * allows spring boot to find and plugin your classes into their framework
      * Spring Boot (modern annotated plug and play)    
        * Spring Web (REST)
          * HTTP get, post, etc
        * Spring Kafka (Message Bus)
            * hub and spoke model for messaging
            * posting and consume messages
            * Kafka streams vs Kafka API
          * asynchronous processing non-blocking of sending message out
          * nice to have for extending functionality at a later time
    * microservices
        * HTTP server
        * GET, POST, etc operations
        * synchronous processing blocked on the response
        * small functional services that do one thing and is not monolithic
        * can be nightmare to maintain
        * request / response architecture
    * state driven architecture
        * useful for asynchronous independent processing
        * event driven architecture
        * internal state
        * the state would change relative to an event
        * some action would be performed as a result of the state changing
        * handy in robotics
        * also useful to understand traditional application space
            * examples
                * Claim (open, monetary value assessed, work assigned, etc. )
                * InsurancePolicy

## Java
* .java compiles into .class files
* build will take .class files and zip them with metadata into a jar file
* JRE (java runtime) runs jar files

### Exceptions
* Java Exceptions
  * Two main types of exceptions
    * Runtime (or any subclass)
      * no need to declare on the method the exception that may be thrown
      * no need to do a try/catch block
    * Non-Runtime
* What was before exception?
  * return codes
  * example
    * A -> B -> C
      * C returned a return code to B
        * B examined the return code and returned something to A
          * A examined the return code from B and did something based on failure or success
  * with Exception, no return code
    * A -> B -> C
      * in this case however if something bad happens in C, it throws an exception
      * B can ignore it
      * A can ignore it
        * JVM will spit out a stack trace
* Interfaces and Classes
  * Interface has no implementation of the method signatures
* MultiThreading in Java
  * Classes
    * Thread
    * Runnable
  * Structures for multi threading
    * BlockingQueue
      * can be shared between threads
      * consumers can block until something is on the queue
* More Collection classes in the JDK
  * "Generics" (like templates in C++ collections)
    * allowing typing of collection classes
    * compile time checks on the type being added to the collection
* Y2K issue
  * 1900 -> "00"
  * 1999 -> "99"
    * big problem would occur in 2000
  * Java saw the issue ahead and create a Date class