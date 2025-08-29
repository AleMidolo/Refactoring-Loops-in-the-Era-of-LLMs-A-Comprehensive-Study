for (Column column : columns) {
    _nameToColumn.put(column.getName(), column);
    int cidx = column.getCellIndex();
    if (cidx > maxCellIndex) {
        maxCellIndex = cidx;
    }
    _cellIndexToColumn.put(cidx, column);
    _columnNames.add(column.getName());
}