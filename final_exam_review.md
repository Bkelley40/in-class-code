# Final Exam review

## General Format
* Similar to Midterms
	* True/False.
	* Multiple choice.
	* "What does this code do".
	* Four-five coding questions, with instructions given as a JUnit test, or as a UML diagram.

## Java basics
* Primitive Java types.
* Java is a strictly-typed language.
* Looping and conditional statements.
* Random access vs linear access.

## Object Oriented Principles
* Understand the terminology of OOP
	* What is encapsulation?
	* What is inheritance?
	* What is polymorphism?

## Basic UML
* extends.
* implements.
* code to UML.
* UML to code.

## Exceptions
* try/catch/finally - how do they work?
* throws keyword.

## File I/O
* Why do we use files?
	* Data-persistence.
* Byte-streams.
	* Add `Scanner` or `PrintWriter` wrapper to get/put info.
* `flush`ing stream.

## Output formatting
* `String.format()` and `printf()`.
	* Precision vs width.
		* Default precision for `double`.
	* Padding (default right-justified).

## Interfaces
* Difference(s) between an abstract class and an interface.
* UML for _implements_.

## Nested Classes
* What is the purpose of a nested class?
	* Inner and outer classes can access each-others private members and methods.
	* Reduce namespace pollution.
* How do we write a nested class.
	* How to instantiate an inner class from an outer class.

## Generics
* ArrayList
	* How is it different from an array?
	* Auto-resize vs right-sized.
	* Tracks how full it is.
	* `get` and `remove` operations and what the resulting list is.
* Creating a generic class.
	```java
	public <DataType extends Comparable<DataType>> DataType min (ArrayList<DataType> foo)
	```
* `extends` keyword even for interfaces.
* Instantiating a generic class.

## GUIs
* Parts of a GUI
	* Container.
	* Component.
	* Layout Manager.
	* Listeners.
		* Three main categories of listeners:
			1. mouse.
			1. discrete events.
			1. continuous events.
* Be able to look at a snippet of GUI code and understand it.

## Recursion
* Know what two conditions must exist.
	1. Base case(s).
	1. Problem approaches base case (gets "smaller") with each recursive step.
* Be able to code a recursive solution.

## Threads
* What is the purpose of threads?
* Downsides?

## Unit Tests
* I love this format for test questions, in case you haven't figure that out yet.
* You can infer the return type, class name, method names and parameters, much the same as you can with UML.
	* Additionally, you can infer the intended behavior.