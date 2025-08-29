oldRows.stream()
        .map(r -> project.rows.get(r))
        .forEach(oldRow -> {
            Row firstNewRow = new Row(newColumns.size());
            int firstNewRowIndex = newRows.size();
            newRows.add(firstNewRow);
            int transposedCells = 0;
            IntStream.range(0, oldColumns.size())
                .forEach(c -> {
                    Column column = oldColumns.get(c);
                    Cell cell = oldRow.getCell(column.getCellIndex());
                    if (c < startColumnIndex) {
                        firstNewRow.setCell(c, cell);
                    } else if (c == startColumnIndex || c < startColumnIndex + columnCount) {
                        if (_combinedColumnName != null) {
                            Cell newCell = cell == null || !ExpressionUtils.isNonBlankData(cell.value) ?
                                    (_prependColumnName && !_ignoreBlankCells ? new Cell(column.getName() + _separator, null) : null)
                                    :(_prependColumnName ? new Cell(column.getName() + _separator + cell.value, null) : cell);

                            Row rowToModify = transposedCells == 0 ? firstNewRow : new Row(newColumns.size());
                            if (transposedCells > 0) newRows.add(rowToModify);

                            rowToModify.setCell(startColumnIndex, newCell);
                            transposedCells++;
                        } else {
                            if (_ignoreBlankCells && (cell == null || !ExpressionUtils.isNonBlankData(cell.value))) return;

                            Row rowToModify = transposedCells == 0 ? firstNewRow : new Row(newColumns.size());
                            if (transposedCells > 0) newRows.add(rowToModify);

                            rowToModify.setCell(startColumnIndex, new Cell(column.getName(), null));
                            rowToModify.setCell(startColumnIndex + 1, cell);
                            transposedCells++;
                        }
                    } else {
                        firstNewRow.setCell(c - columnCount + (_combinedColumnName != null ? 1 : 2), cell);
                    }
                });

            if (_fillDown) {
                newRows.subList(firstNewRowIndex + 1, newRows.size()).forEach(newRow -> IntStream.range(0, newColumns.size())
                        .filter(c -> c < startColumnIndex || (_combinedColumnName != null ? c > startColumnIndex : c > startColumnIndex + 1))
                        .forEach(c -> {
                            Column column = newColumns.get(c);
                            int cellIndex = column.getCellIndex();
                            Cell cellToCopy = firstNewRow.getCell(cellIndex);
                            if (cellToCopy != null && newRow.getCell(cellIndex) == null) {
                                newRow.setCell(cellIndex, cellToCopy);
                            }
                        }));
            }
        });