for (String columnName : columnNames) {
    int index = project.columnModel.allocateNewCellIndex();
    Column column = new Column(index, columnName);
    project.columnModel.addColumn(index, column, true);
}