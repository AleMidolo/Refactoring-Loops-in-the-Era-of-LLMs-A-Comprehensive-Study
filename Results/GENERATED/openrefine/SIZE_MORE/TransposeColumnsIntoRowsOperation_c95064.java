oldRows.stream()
                .map(oldRow -> {
                    Row firstNewRow = new Row(newColumns.size());
                    int firstNewRowIndex = newRows.size();
                    newRows.add(firstNewRow);
                    AtomicInteger transposedCells = new AtomicInteger(0);

                    oldColumns.stream()
                            .forEach(c -> {
                                Column column = c;
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

                                        Row rowToModify = transposedCells.get() == 0 ? firstNewRow : new Row(newColumns.size());
                                        if (transposedCells.getAndIncrement() > 0) newRows.add(rowToModify);

                                        rowToModify.setCell(startColumnIndex, newCell);
                                    } else {
                                        if (_ignoreBlankCells && (cell == null || !ExpressionUtils.isNonBlankData(cell.value))) {
                                            return;
                                        }

                                        Row rowToModify = transposedCells.get() == 0 ? firstNewRow : new Row(newColumns.size());
                                        if (transposedCells.getAndIncrement() > 0) newRows.add(rowToModify);

                                        rowToModify.setCell(startColumnIndex, new Cell(column.getName(), null));
                                        rowToModify.setCell(startColumnIndex + 1, cell);
                                    }
                                } else {
                                    firstNewRow.setCell(c - columnCount + (_combinedColumnName != null ? 1 : 2), cell);
                                }
                            });

                    if (_fillDown) {
                        newRows.subList(firstNewRowIndex + 1, newRows.size())
                                .forEach(newRow -> IntStream.range(0, newColumns.size())
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
                    return null;
                });