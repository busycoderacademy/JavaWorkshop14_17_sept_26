# Java Collections & Generics — Session 3

Java 21 Maven project matching the supplied Session 3 infographics.

## Package structure

- `com.busycoder.example1` — Object class
- `com.busycoder.example2` — Java Collections API introduction
- `com.busycoder.example3` — ArrayList vs LinkedList
- `com.busycoder.example4` — Comparable vs Comparator
- `com.busycoder.example5` — HashMap
- `com.busycoder.example6` — Set
- `com.busycoder.example7` — PriorityQueue
- `com.busycoder.example8` — Generics introduction
- `com.busycoder.example9` — PECS
- `com.busycoder.example10` — Generic real-life examples

## Build

```bash
mvn clean compile
```

## Run examples

Each package has a separate `App` class. For example:

```bash
mvn exec:java -Dexec.mainClass=com.busycoder.example5.App
```

No inner classes are used. Supporting classes are top-level classes in their respective packages.
