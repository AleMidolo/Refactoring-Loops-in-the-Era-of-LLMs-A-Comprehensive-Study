oldRows.stream()
        .skip(r)
        .limit(_rowCount)
        .map(oldRow -> IntStream.range(0, newColumns.size())
                .mapToObj(c -> {
                    Column column = oldColumns.get(c);
                    Cell cell = oldRow.getCell(column.getCellIndex());
                    if (cell != null && cell.value != null) {
                        if (c == columnIndex) {
                            return new AbstractMap.SimpleEntry<>(columnIndex + r2, cell);
                        } else if (c < columnIndex) {
                            return new AbstractMap.SimpleEntry<>(c, cell);
                        } else {
                            return new AbstractMap.SimpleEntry<>(c + _rowCount - 1, cell);
                        }
                    }
                    return null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1))
        )
        .filter(map -> map.containsValue(cell -> cell != null && cell.value != null))
        .map(map -> new Row(map))
        .forEach(newRows::add);