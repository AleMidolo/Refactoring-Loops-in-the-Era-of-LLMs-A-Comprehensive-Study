for (int n = 0; n < _rowCount; n++) {
    String columnName = _columnName + " " + newIndex++;
    while (project.columnModel.getColumnByName(columnName) != null) {
        columnName = _columnName + " " + newIndex++;
    }
    newColumns.add(new Column(i + n, columnName));
}