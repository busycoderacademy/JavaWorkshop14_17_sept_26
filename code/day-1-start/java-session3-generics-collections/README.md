# Java Collections & Generics — Session 3

Java 21 Maven project matching the supplied Session 3 infographics.

## Package structure

- `com.session2.example1` — Object class
- `com.session2.example2` — Java Collections API introduction
- `com.session2.example3` — ArrayList vs LinkedList
- `com.session2.example4` — Comparable vs Comparator
- `com.session2.example5` — HashMap
- `com.session2.example6` — Set
- `com.session2.example7` — PriorityQueue
- `com.session2.example8` — Generics introduction
- `com.session2.example9` — PECS
- `com.session2.example10` — Generic real-life examples

## Build

```bash
mvn clean compile
```

## Run examples

Each package has a separate `App` class. For example:

```bash
mvn exec:java -Dexec.mainClass=com.session2.example5.App
```

No inner classes are used. Supporting classes are top-level classes in their respective packages.
