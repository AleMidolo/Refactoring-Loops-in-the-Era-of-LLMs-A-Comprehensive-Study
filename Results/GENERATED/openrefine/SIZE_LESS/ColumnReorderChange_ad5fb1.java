```java
IntStream.range(0, _oldCells.length)
    .forEach(i -> {
        Row row = project.rows.get(_oldCells[i].row);
        row.setCell(_oldCells[i].cellIndex, _oldCells[i].cell);
    });
```