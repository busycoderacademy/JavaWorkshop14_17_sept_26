# Java Core Fundamentals & OOP — Code Samples

Java version: **21**  
Build tool: **Maven**  
Base package: `com.busycoder`

The project follows the uploaded training slides topic-by-topic.

## Package mapping

1. `topic1` — Java Fundamentals: OOPL + JVM + libraries
2. `topic2` — Java Basics
3. `topic3` — OOP Basics
4. `topic4` — OOP Thinking Process
5. `topic5` — Abstraction vs Encapsulation
6. `topic6` — OOP Core Concepts
7. `topic7` — OOP Pillars in Action
8. `topic8` — Interface vs Abstract Class
9. `topic9` — Basic OOP Syntax
10. `topic10` — `this` Keyword
11. `topic11` — Package Concept
12. `topic12` — UML Basics
13. `topic13` — Inheritance
14. `topic14` — Overloading vs Overriding
15. `topic15` — Polymorphism
16. `topic16` — Abstract Classes
17. `topic17` — `final` Keyword
18. `topic18` — Interfaces
19. `topic19` — String

## Design choice

Generic names such as `App`, `Application`, or `Test` are deliberately avoided.
Each executable class has a logical name matching the concept being demonstrated.

## Run

Compile everything:

```bash
mvn clean compile
```

Run an example:

```bash
mvn exec:java -Dexec.mainClass=com.busycoder.topic10_poly.PolymorphismDemo
```

The examples are intentionally small and trainer-friendly. Comments explain the
important language rules without turning every line into a textbook.
