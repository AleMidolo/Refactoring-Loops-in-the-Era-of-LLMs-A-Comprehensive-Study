```java
String result = Arrays.stream(objects)
        .map(obj -> "\"" + String.valueOf(obj) + "\"")
        .collect(Collectors.joining(","));
```