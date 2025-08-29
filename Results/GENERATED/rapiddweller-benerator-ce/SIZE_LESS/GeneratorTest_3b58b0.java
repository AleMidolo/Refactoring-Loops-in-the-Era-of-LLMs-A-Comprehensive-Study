```java
totalExpectedWeight = IntStream.range(1, expectedValueWeightPairs.length)
    .filter(i -> i % 2 == 1)
    .mapToDouble(i -> ((Number) expectedValueWeightPairs[i]).doubleValue())
    .sum();
```