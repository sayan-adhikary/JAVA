# JAVA
All about Java
# Java, Topics, Definitions, and Examples

This document follows the W3Schools Java tutorial structure. Each topic shows a short definition, key points, and at least one clear example you can run locally.

---

# 1. Java Introduction
Definition
Java is a high-level, object-oriented programming language. It runs on the Java Virtual Machine, which enables platform independence.

Quick example
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

# 2. Java Environment Setup
Definition
Install JDK and set PATH. Use java to run compiled .class files.

Steps
1. Download JDK from Oracle or OpenJDK.
2. Install.
3. Set JAVA_HOME and update PATH.

---

# 3. Java Syntax
Definition
Syntax defines how to write valid Java programs, including class and method structure, statements, and expressions.

Example
```java
class MyClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(x + y);
    }
}
```

---

# 4. Variables and Data Types
Definition
Variables store values. Java has primitive types and reference types.

Primitives
byte, short, int, long, float, double, char, boolean

Example
```java
int age = 21;
double price = 9.99;
char letter = 'A';
boolean flag = true;
```

---

# 5. Operators
Definition
Arithmetic, assignment, comparison, logical, bitwise, and ternary operators.

Example
```java
int a = 5 + 3; // 8
boolean b = (a > 5) && (a < 10); // true
int c = (a % 2 == 0) ? 1 : 0;
```

---

# 6. Strings and String Methods
Definition
String is an object that holds text. Common methods: length, charAt, substring, indexOf, replace, toUpperCase, toLowerCase.

Example
```java
String s = "Hello";
System.out.println(s.length());
System.out.println(s.substring(1, 4));
```

---

# 7. Math Class
Definition
Utility methods for math operations: abs, max, min, pow, sqrt, random.

Example
```java
double r = Math.random();
int max = Math.max(5, 10);
```

---

# 8. Booleans and Conditional Statements
Definition
Use boolean values with if, else if, and else. Use switch for multi-branch cases.

If example
```java
int score = 85;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C or below");
}
```

Switch example
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other day");
}
```

---

# 9. Loops
Definition
for, while, and do while loops repeat code.

Examples
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

# 10. Methods
Definition
Methods are blocks of code that perform tasks. They can take parameters and return values.

Example
```java
public class Calc {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }
}
```

---

# 11. Method Overloading and Recursion
Definition
Overloading: same method name, different parameters. Recursion: method calls itself.

Example (overload)
```java
public static int sum(int a, int b) { return a + b; }
public static double sum(double a, double b) { return a + b; }
```

Recursion
```java
public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

---

# 12. Scope
Definition
Scope defines where variables are accessible: method scope, block scope, class scope.

---

# 13. Constructors
Definition
Constructors initialize new objects. They share the class name and have no return type.

Example
```java
public class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
}
```

---

# 14. Garbage Collection
Definition
Java automatically reclaims memory for unreachable objects. You cannot force immediate collection.

---

# 15. Access Modifiers
Definition
public, private, protected, default control access to classes, methods, and fields.

Example
```java
public class Demo {
    private int secret;
    public int open;
}
```

---

# 16. Keywords
Definition
Reserved words in Java like class, public, static, void, new, if, else, switch, case, for, while, try, catch, finally, throw, throws, return, extends, implements.

---

# 17. Arrays
Definition
Fixed-size ordered collections of elements. Supports single and multi-dimensional arrays.

Example
```java
int[] arr = {1, 2, 3};
for (int n : arr) System.out.println(n);

int[][] matrix = { {1, 2}, {3, 4} };
```

---

# 18. ArrayList and Collections
Definition
ArrayList is a resizable array. Java Collections Framework includes List, Set, Map, and utility classes.

Example
```java
import java.util.ArrayList;
ArrayList<String> list = new ArrayList<>();
list.add("a");
list.remove("a");
```

---

# 19. LinkedList, Set, Map, and Iterators
Definition
LinkedList, HashSet, TreeSet, HashMap, TreeMap, LinkedHashMap. Use Iterator to traverse.

Example
```java
import java.util.HashMap;
HashMap<String, Integer> map = new HashMap<>();
map.put("one", 1);
System.out.println(map.get("one"));
```

---

# 20. Date and Time
Definition
Use java.time package: LocalDate, LocalTime, LocalDateTime, DateTimeFormatter.

Example
```java
import java.time.LocalDate;
LocalDate today = LocalDate.now();
System.out.println(today);
```

---

# 21. Regular Expressions
Definition
Use java.util.regex.Pattern and Matcher for pattern matching.

Example
```java
import java.util.regex.*;
Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher("123abc");
if (m.find()) System.out.println(m.group());
```

---

# 22. File I O
Definition
Read and write files with java.io and java.nio packages.

Example
```java
import java.nio.file.*;
String data = "Hello";
Files.writeString(Path.of("out.txt"), data);
String in = Files.readString(Path.of("out.txt"));
```

---

# 23. Exception Handling
Definition
Use try, catch, finally, throw, throws to handle errors.

Example
```java
try {
    int a = 5 / 0;
} catch (ArithmeticException e) {
    System.out.println("Divide by zero");
} finally {
    System.out.println("Done");
}
```

---

# 24. Custom Exceptions
Definition
Create exceptions by extending Exception or RuntimeException.

Example
```java
class MyException extends Exception {
    public MyException(String msg) { super(msg); }
}
```

---

# 25. OOP Concepts

## Classes and Objects
Definition
Class is a blueprint. Object is an instance of a class.

Example
```java
public class Car {
    String model;
    public Car(String m) { model = m; }
}
Car c = new Car("Toyota");
```

## Inheritance
Definition
Subclass extends superclass to reuse code.

Example
```java
class Animal { void eat() { } }
class Dog extends Animal { void bark() { } }
```

## Polymorphism
Definition
Objects take many forms using overriding and reference polymorphism.

Example
```java
Animal a = new Dog();
a.eat();
```

## Abstraction
Definition
Abstract classes and interfaces hide implementation details.

Example
```java
abstract class Shape { abstract double area(); }
interface Drawable { void draw(); }
```

## Encapsulation
Definition
Keep fields private, expose public methods.

Example
```java
class Person { private String name; public String getName() { return name; } }
```

---

# 26. Interfaces
Definition
Interfaces declare methods that implementing classes must define. Support default and static methods.

Example
```java
interface Runner { void run(); }
class Athlete implements Runner { public void run() { System.out.println("Run"); } }
```

---

# 27. Packages
Definition
Packages group related classes and control namespace.

Example
```java
package com.example;
public class Util { }
```

---

# 28. Threads and Concurrency
Definition
Create threads via Runnable or Thread. Use synchronized, locks, and concurrent utilities.

Example
```java
Thread t = new Thread(() -> System.out.println("Run"));
t.start();
```

---

# 29. Lambda Expressions and Streams
Definition
Lambda expressions provide concise function syntax. Streams enable functional-style operations on collections.

Example
```java
import java.util.*;
List<Integer> nums = List.of(1, 2, 3);
nums.stream().map(n -> n * 2).forEach(System.out::println);
```

---

# 30. Generics
Definition
Generics enforce type safety for collections and classes.

Example
```java
class Box<T> { T value; public Box(T v) { value = v; } }
Box<String> b = new Box<>("hi");
```

---

# 31. Annotations and Reflection
Definition
Annotations add metadata. Reflection inspects classes at runtime.

Example
```java
@Override
public String toString() { return "x"; }
```

---

# 32. Serialization
Definition
Convert objects to byte streams with Serializable.

Example
```java
import java.io.*;
class Person implements Serializable { String name; }
```

---

# 33. JDBC and Databases
Definition
Use JDBC to connect to relational databases, execute queries, and handle results.

Example
```java
// Outline only, setup and drivers required
import java.sql.*;
Connection conn = DriverManager.getConnection(url, user, pass);
```

---

# 34. Networking
Definition
Use java.net for sockets and URL connections.

Example
```java
import java.net.*;
URL url = new URL("http://example.com");
URLConnection conn = url.openConnection();
```

---

# 35. Java Modules
Definition
Module system introduced in Java 9 organizes code and controls access.

---

# 36. Best Practices
- Use meaningful names.
- Keep methods small.
- Use exceptions for exceptional cases only.
- Prefer interfaces for APIs.
- Use try-with-resources for I O.

---

# Running examples
All examples are plain Java. Save each example in a .java file, compile with javac, run with java.

# Sources
Based on the W3Schools Java tutorial at https://www.w3schools.com/java/default.asp


