oldRows.stream()
    .flatMap(r -> IntStream.range(0, r.size() / _rowCount)
        .mapToObj(i -> new Row(newColumns.size()))
        .peek(firstNewRow -> IntStream.range(0, _rowCount)
            .filter(r2 -> r2 + i * _rowCount < r.size())
            .mapToObj(r2 -> {
                Row oldRow = r.get(i * _rowCount + r2);
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
                return newRow;
            }))
    .collect(Collectors.toList());