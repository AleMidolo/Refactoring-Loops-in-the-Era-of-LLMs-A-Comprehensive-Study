oldColumns.stream()
    .map(column -> {
        if (_startColumnName.equals(column.getName())) {
            startColumnIndex[0] = oldColumns.indexOf(column);
            if (_combinedColumnName != null) {
                return new Column(newColumns.size(), _combinedColumnName);
            } else {
                newColumns.add(new Column(newColumns.size(), _keyColumnName));
                return new Column(newColumns.size(), _valueColumnName);
            }
        } else {
            Column newColumn = new Column(newColumns.size(), column.getOriginalHeaderLabel());
            newColumn.setName(column.getName());
            return newColumn;
        }
    })
    .forEach(newColumns::add);