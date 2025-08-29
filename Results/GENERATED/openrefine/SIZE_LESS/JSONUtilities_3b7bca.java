```java
IntStream.range(0, r.length)
        .forEach(i -> r[i] = a.get(i).asText());
```