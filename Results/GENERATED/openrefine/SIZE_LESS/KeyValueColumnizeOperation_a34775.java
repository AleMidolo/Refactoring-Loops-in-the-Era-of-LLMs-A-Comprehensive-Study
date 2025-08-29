unchangedColumns.stream()
    .forEach(unchangedColumn -> {
        int cellIndex = unchangedColumn.getCellIndex();
        reusableRow.setCell(cellIndex, oldRow.getCell(cellIndex));
    });