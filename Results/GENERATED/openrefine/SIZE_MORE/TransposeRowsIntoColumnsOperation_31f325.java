oldRows.stream()
    .flatMap(r -> IntStream.range(0, oldRows.size() / _rowCount)
        .mapToObj(i -> new Row(newColumns.size()))
        .flatMap(firstRow -> IntStream.range(0, _rowCount)
            .mapToObj(r2 -> {
                int index = r * _rowCount + r2;
                if (index >= oldRows.size()) return null;
                Row oldRow = oldRows.get(index);
                Row newRow = r2 == 0 ? firstRow : new Row(newColumns.size());
                boolean hasData = r2 == 0;
                IntStream.range(0, oldColumns.size())
                    .forEach(c -> {
                        Column column = oldColumns.get(c);
                        Cell cell = oldRow.getCell(column.getCellIndex());
                        if (cell != null && cell.value != null) {
                            if (c == columnIndex) {
                                firstRow.setCell(columnIndex + r2, cell);
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
        .filter(Objects::nonNull)
        .collect(Collectors.toList());