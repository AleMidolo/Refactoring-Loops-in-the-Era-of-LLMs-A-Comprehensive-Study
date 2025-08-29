for (int i = 0; i < _columnNames.size(); i++) {
    String name = _columnNames.get(i);
    int cellIndex = _firstNewCellIndex + i;
    Column column = new Column(cellIndex, name);
    project.columnModel.columns.add(_columnIndex + 1 + i, column);
}