# TDD

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