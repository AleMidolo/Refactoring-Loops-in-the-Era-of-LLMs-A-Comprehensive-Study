```java
IntStream.range(0, 100)
    .mapToObj(i -> generator.generate())
    .forEach(sequence -> checkSequence(sequence, depth));
```