for (String n : _columnNames) {
    Column column = project.columnModel.getColumnByName(n);
    if (column != null) {
        _newColumns.add(column);
    }
}