oldRows.stream()
        .flatMap(r -> IntStream.range(0, oldRows.size() / _rowCount)
            .mapToObj(i -> new Row(newColumns.size()))
            .reduce((newRow, oldRow) -> {
                boolean[] hasData = {false};
                IntStream.range(0, oldColumns.size())
                    .forEach(c -> {
                        Column column = oldColumns.get(c);
                        Cell cell = oldRow.getCell(column.getCellIndex());
                        if (cell != null && cell.value != null) {
                            if (c == columnIndex) {
                                newRow.setCell(columnIndex + oldRow, cell);
                            } else if (c < columnIndex) {
                                newRow.setCell(c, cell);
                                hasData[0] = true;
                            } else {
                                newRow.setCell(c + _rowCount - 1, cell);
                                hasData[0] = true;
                            }
                        }
                    });
                if (hasData[0]) {
                    newRows.add(newRow);
                }
                return newRow;
            })).count();