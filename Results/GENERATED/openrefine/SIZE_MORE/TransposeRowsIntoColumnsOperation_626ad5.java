oldRows.stream()
    .skip(r)
    .limit(_rowCount)
    .map(oldRow -> {
        Row newRow = IntStream.range(0, newColumns.size())
            .mapToObj(i -> r2 == 0 ? firstNewRow : new Row(newColumns.size()))
            .findFirst()
            .get();
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
        return hasData ? newRow : null;
    })
    .filter(Objects::nonNull)
    .forEach(newRows::add);