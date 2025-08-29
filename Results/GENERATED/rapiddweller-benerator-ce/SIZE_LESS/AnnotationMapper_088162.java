```java
String result = IntStream.range(0, values.length)
    .mapToObj(i -> (i > 0 ? "," : "") + "'" + values[i].replace("'", "\\'") + "'")
    .collect(Collectors.joining());
```