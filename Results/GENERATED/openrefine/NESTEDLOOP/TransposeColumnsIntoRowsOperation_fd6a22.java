oldRows.stream()
        .map(oldRow -> {
            Row firstNewRow = new Row(newColumns.size());
            int firstNewRowIndex = newRows.size();
            newRows.add(firstNewRow);
            int[] transposedCells = {0};
            oldColumns.stream()
                    .forEach(column -> {
                        Cell cell = oldRow.getCell(column.getCellIndex());
                        if (oldColumns.indexOf(column) < startColumnIndex) {
                            firstNewRow.setCell(oldColumns.indexOf(column), cell);
                        } else if (oldColumns.indexOf(column) == startColumnIndex || oldColumns.indexOf(column) < startColumnIndex + columnCount) {
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
                                if (transposedCells[0] == 0) {
                                    rowToModify = firstNewRow;
                                } else {
                                    rowToModify = new Row(newColumns.size());
                                    newRows.add(rowToModify);
                                }
                                rowToModify.setCell(startColumnIndex, newCell);
                                transposedCells[0]++;
                            } else {
                                if (_ignoreBlankCells && (cell == null || !ExpressionUtils.isNonBlankData(cell.value))) {
                                    return;
                                }
                                Row rowToModify;
                                if (transposedCells[0] == 0) {
                                    rowToModify = firstNewRow;
                                } else {
                                    rowToModify = new Row(newColumns.size());
                                    newRows.add(rowToModify);
                                }
                                rowToModify.setCell(startColumnIndex, new Cell(column.getName(), null));
                                rowToModify.setCell(startColumnIndex + 1, cell);
                                transposedCells[0]++;
                            }
                        } else {
                            firstNewRow.setCell(oldColumns.indexOf(column) - columnCount + (_combinedColumnName != null ? 1 : 2), cell);
                        }
                    });
            if (_fillDown) {
                for (int r2 = firstNewRowIndex + 1; r2 < newRows.size(); r2++) {
                    Row newRow = newRows.get(r2);
                    newColumns.stream().forEach(column -> {
                        if (newColumns.indexOf(column) < startColumnIndex || (_combinedColumnName != null ? newColumns.indexOf(column) > startColumnIndex : newColumns.indexOf(column) > startColumnIndex + 1)) {
                            int cellIndex = column.getCellIndex();
                            Cell cellToCopy = firstNewRow.getCell(cellIndex);
                            if (cellToCopy != null && newRow.getCell(cellIndex) == null) {
                                newRow.setCell(cellIndex, cellToCopy);
                            }
                        }
                    });
                }
            }
            return firstNewRow;
        })
        .collect(Collectors.toList());