for (int i = 0; i < columnCount; i++) {
    Column column = oldColumns.get(i);
    if (i == columnIndex) {
        int newIndex = 1;
        for (int n = 0; n < _rowCount; n++) {
            String columnName = _columnName + " " + newIndex++;
            while (project.columnModel.getColumnByName(columnName) != null) {
                columnName = _columnName + " " + newIndex++;
            }
            newColumns.add(new Column(i + n, columnName));
        }
    } else if (i < columnIndex) {
        newColumns.add(new Column(i, column.getName()));
    } else {
        newColumns.add(new Column(i + _rowCount - 1, column.getName()));
    }
}