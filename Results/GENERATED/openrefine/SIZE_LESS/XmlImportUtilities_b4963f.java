```java
nextRowIndex = thisColumnGroup.columns.values()
                .stream()
                .mapToInt(column2 -> column2.nextRowIndex)
                .max()
                .orElse(nextRowIndex);
```