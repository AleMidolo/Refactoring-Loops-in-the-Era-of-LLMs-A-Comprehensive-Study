oldRows.stream()
        .filter(r -> r < oldRows.size())
        .map(r -> new Row(newColumns.size()))
        .forEach(firstNewRow -> IntStream.range(0, oldRows.size())
                .filter(r2 -> r2 < _rowCount && r + r2 < oldRows.size())
                .forEach(r2 -> {
                    Row oldRow = oldRows.get(r + r2);
                    Row newRow = r2 == 0 ? firstNewRow : new Row(newColumns.size());
                    boolean hasData = r2 == 0;
                    IntStream.range(0, oldColumns.size())
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
                    if (hasData) {
                        newRows.add(newRow);
                    }
                }));
