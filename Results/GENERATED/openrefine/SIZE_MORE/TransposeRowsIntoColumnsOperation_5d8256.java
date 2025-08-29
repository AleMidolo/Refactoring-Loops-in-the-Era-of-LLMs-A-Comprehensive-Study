oldColumns.stream()
    .forEach(c -> {
        Column column = oldColumns.get(c);
        Cell cell = oldRow.getCell(column.getCellIndex());
        if (cell != null && cell.value != null) {
            if (c == columnIndex) {
                firstNewRow.setCell(columnIndex + r2, cell);
            } else if (c < columnIndex) {
                newRow.setCell(c, cell);
                hasData = true;
            } else {
                newRow.setCell(c + _rowCount - 1, cell);
                hasData = true;
            }
        }
    });