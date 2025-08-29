for (int i = 0; i < columnCount; i++) {
    Column column = oldColumns.get(i);
    if (i == columnIndex) {
        int newIndex = 1;
        IntStream.range(0, _rowCount).mapToObj(n -> {
            String columnName = _columnName + " " + newIndex++;
            while (project.columnModel.getColumnByName(columnName) != null) {
                columnName = _columnName + " " + newIndex++;
            }
            return new Column(i + n, columnName);
        }).forEach(newColumns::add);
    } else if (i < columnIndex) {
        newColumns.add(new Column(i, column.getName()));
    } else {
        newColumns.add(new Column(i + _rowCount - 1, column.getName()));
    }
}