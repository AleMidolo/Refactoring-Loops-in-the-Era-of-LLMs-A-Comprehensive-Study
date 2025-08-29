oldRows.stream()
    .skip(r)
    .limit(_rowCount)
    .map(oldRow -> IntStream.range(0, newColumns.size())
            .mapToObj(c -> {
                Column column = oldColumns.get(c);
                Cell cell = oldRow.getCell(column.getCellIndex());
                if (cell != null && cell.value != null) {
                    if (c == columnIndex) {
                        firstNewRow.setCell(columnIndex + r2, cell);
                    } else if (c < columnIndex) {
                        return new AbstractMap.SimpleEntry<>(c, cell);
                    } else {
                        return new AbstractMap.SimpleEntry<>(c + _rowCount - 1, cell);
                    }
                } else {
                    return null;
                }
            })
            .filter(Objects::nonNull)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (existing, replacement) -> existing)))
    .map(cellMap -> {
        Row newRow = cellMap.isEmpty() ? new Row(newColumns.size()) : firstNewRow;
        cellMap.forEach(newRow::setCell);
        return newRow;
    })
    .filter(row -> !row.isEmpty())
    .forEach(newRows::add);