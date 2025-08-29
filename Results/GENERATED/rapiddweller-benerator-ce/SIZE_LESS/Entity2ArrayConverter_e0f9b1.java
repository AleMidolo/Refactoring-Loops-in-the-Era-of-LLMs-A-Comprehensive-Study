```java
IntStream.range(0, featureNames.length)
        .forEach(i -> result[i] = entity.getComponent(featureNames[i]));
```