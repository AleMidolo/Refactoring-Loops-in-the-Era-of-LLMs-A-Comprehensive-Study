oldColumns.stream()
    .forEach(c -> {
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
                        return;
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
                    return;
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
    });