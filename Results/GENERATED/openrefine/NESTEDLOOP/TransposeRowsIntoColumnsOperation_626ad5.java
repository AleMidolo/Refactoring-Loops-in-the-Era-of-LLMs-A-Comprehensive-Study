IntStream.range(0, _rowCount)
    .filter(r2 -> r + r2 < oldRows.size())
    .forEach(r2 -> {
        Row oldRow = oldRows.get(r + r2);
        Row newRow = r2 == 0 ? firstNewRow : new Row(newColumns.size());
        boolean hasData = r2 == 0;
        IntStream.range(0, oldColumns.size()).forEach(c -> {
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
        if (hasData) {
            newRows.add(newRow);
        }
    });