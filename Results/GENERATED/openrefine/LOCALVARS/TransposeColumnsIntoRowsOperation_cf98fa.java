oldColumns.stream()
    .forEach(column -> {
        if (columnsLeftToTranspose == 0) {
            Column newColumn = new Column(newColumns.size(), column.getOriginalHeaderLabel());
            newColumn.setName(column.getName());
            newColumns.add(newColumn);
        } else if (columnsLeftToTranspose < _columnCount) {
            columnsLeftToTranspose--;
        } else if (_startColumnName.equals(column.getName())) {
            startColumnIndex = oldColumns.indexOf(column);
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
    });