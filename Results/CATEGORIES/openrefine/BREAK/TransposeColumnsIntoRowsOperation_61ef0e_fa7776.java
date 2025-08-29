for (int c = 0; c < oldColumns.size(); c++) {
    Column column = oldColumns.get(c);
    if (_startColumnName.equals(column.getName())) {
        startColumnIndex = c;
        if (_combinedColumnName != null) {
            newColumns.add(new Column(newColumns.size(), _combinedColumnName));
        } else {
            newColumns.add(new Column(newColumns.size(), _keyColumnName));
            newColumns.add(new Column(newColumns.size(), _valueColumnName));
        }
        break;
    } else {
        Column newColumn = new Column(newColumns.size(), column.getOriginalHeaderLabel());
        newColumn.setName(column.getName());
        newColumns.add(newColumn);
    }
}