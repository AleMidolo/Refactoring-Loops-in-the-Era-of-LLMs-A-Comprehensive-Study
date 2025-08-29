for (int r = 0; r < oldRows.size(); r++) {
    Row oldRow = project.rows.get(r);
    Row firstNewRow = new Row(newColumns.size());
    int firstNewRowIndex = newRows.size();
    newRows.add(firstNewRow);
    int transposedCells = 0;
    for (int c = 0; c < oldColumns.size(); c++) {
        Column column = oldColumns.get(c);
        Cell cell = oldRow.getCell(column.getCellIndex());
        if (c < startColumnIndex) {
            firstNewRow.setCell(c, cell);
        } else if (c == startColumnIndex || c < startColumnIndex + columnCount) {
            if (_combinedColumnName != null) {
                Cell newCell;
                if (cell == null || !ExpressionUtils.isNonBlankData(cell.value)) {
                    if (_prependColumnName && !_ignoreBlankCells) {
                        newCell = new Cell(column.getName() + _separator, null);
                    } else {
                        continue;
                    }
                } else if (_prependColumnName) {
                    newCell = new Cell(column.getName() + _separator + cell.value, null);
                } else {
                    newCell = cell;
                }
                Row rowToModify;
                if (transposedCells == 0) {
                    rowToModify = firstNewRow;
                } else {
                    rowToModify = new Row(newColumns.size());
                    newRows.add(rowToModify);
                }
                rowToModify.setCell(startColumnIndex, newCell);
                transposedCells++;
            } else {
                if (_ignoreBlankCells && (cell == null || !ExpressionUtils.isNonBlankData(cell.value))) {
                    continue;
                }
                Row rowToModify;
                if (transposedCells == 0) {
                    rowToModify = firstNewRow;
                } else {
                    rowToModify = new Row(newColumns.size());
                    newRows.add(rowToModify);
                }
                rowToModify.setCell(startColumnIndex, new Cell(column.getName(), null));
                rowToModify.setCell(startColumnIndex + 1, cell);
                transposedCells++;
            }
        } else {
            firstNewRow.setCell(c - columnCount + (_combinedColumnName != null ? 1 : 2), cell);
        }
    }
    if (_fillDown) {
        for (int r2 = firstNewRowIndex + 1; r2 < newRows.size(); r2++) {
            Row newRow = newRows.get(r2);
            for (int c = 0; c < newColumns.size(); c++) {
                if (c < startColumnIndex || (_combinedColumnName != null ? c > startColumnIndex : c > startColumnIndex + 1)) {
                    Column column = newColumns.get(c);
                    int cellIndex = column.getCellIndex();
                    Cell cellToCopy = firstNewRow.getCell(cellIndex);
                    if (cellToCopy != null && newRow.getCell(cellIndex) == null) {
                        newRow.setCell(cellIndex, cellToCopy);
                    }
                }
            }
        }
    }
}