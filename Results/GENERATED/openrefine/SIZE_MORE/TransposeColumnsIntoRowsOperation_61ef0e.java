oldColumns.stream()
          .takeWhile(column -> ! _startColumnName.equals(column.getName()))
          .map(column -> new Column(newColumns.size(), column.getOriginalHeaderLabel()))
          .peek(newColumn -> newColumn.setName(column.getName()))
          .forEach(newColumns::add);

if (startColumnIndex < oldColumns.size()) {
    if (_combinedColumnName != null) {
        newColumns.add(new Column(newColumns.size(), _combinedColumnName));
    } else {
        newColumns.add(new Column(newColumns.size(), _keyColumnName));
        newColumns.add(new Column(newColumns.size(), _valueColumnName));
    }
}