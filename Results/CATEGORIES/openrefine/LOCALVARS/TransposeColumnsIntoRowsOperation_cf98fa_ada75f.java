for (int c = 0; c < oldColumns.size(); c++) {
    Column column = oldColumns.get(c);
    if (columnsLeftToTranspose == 0) {
        Column newColumn = new Column(newColumns.size(), column.getOriginalHeaderLabel());
        newColumn.setName(column.getName());
        newColumns.add(newColumn);
    } else if (columnsLeftToTranspose < _columnCount) {
        columnsLeftToTranspose--;
    } else if (_startColumnName.equals(column.getName())) {
        startColumnIndex = c;
        if (_combinedColumnName != null) {
            newColumns.add(new Column(newColumns.size(), _combinedColumnName));
        } else {
            newColumns.add(new Column(newColumns.size(), _keyColumnName));
            newColumns.add(new Column(newColumns.size(), _valueColumnName));
        }
        columnsLeftToTranspose--;
    } else {
        Column newColumn = new Column(newColumns.size(), column.getOriginalHeaderLabel());
        newColumn.setName(column.getName());
        newColumns.add(newColumn);
    }
}