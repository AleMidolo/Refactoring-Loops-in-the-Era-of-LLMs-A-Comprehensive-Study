```java
IntStream.range(0, project.rows.size())
    .forEach(i -> IntStream.range(0, _removedColumns.size())
        .forEach(j -> {
            int cellIndex = _removedColumns.get(j).getCellIndex();
            Row row = project.rows.get(i);
            Cell oldCell = cellIndex < row.cells.size() ? row.cells.get(cellIndex) : null;
            _oldCells[count++] = new CellAtRowCellIndex(i, cellIndex, oldCell);
        }));
```