oldColumns.stream()
    .takeWhile(column -> !startColumnName.equals(column.getName()))
    .map(column -> new Column(newColumns.size(), column.getOriginalHeaderLabel()))
    .peek(newColumn -> newColumn.setName(column.getName()))
    .forEach(newColumns::add);
if (startColumnIndex != -1) {
    if (_combinedColumnName != null) {
        newColumns.add(new Column(newColumns.size(), _combinedColumnName));
    } else {
        newColumns.add(new Column(newColumns.size(), _keyColumnName));
        newColumns.add(new Column(newColumns.size(), _valueColumnName));
    }
}