for (int r2 = 0; r2 < _rowCount && r + r2 < oldRows.size(); r2++) {
    Row oldRow = oldRows.get(r + r2);
    Row newRow = r2 == 0 ? firstNewRow : new Row(newColumns.size());
    boolean hasData = r2 == 0;
    for (int c = 0; c < oldColumns.size(); c++) {
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
    }
    if (hasData) {
        newRows.add(newRow);
    }
}