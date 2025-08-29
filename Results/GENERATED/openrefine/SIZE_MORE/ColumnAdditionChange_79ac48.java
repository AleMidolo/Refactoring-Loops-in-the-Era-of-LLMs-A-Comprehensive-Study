project.columnModel.columnGroups.subList(0, columnGroupCount).stream()
    .map(columnGroup -> {
        _oldColumnGroups.add(columnGroup);
        if (columnGroup.startColumnIndex <= _columnIndex) {
            if (columnGroup.startColumnIndex + columnGroup.columnSpan > _columnIndex) {
                return new ColumnGroup(columnGroup.startColumnIndex, columnGroup.columnSpan + 1, columnGroup.keyColumnIndex < _columnIndex ? columnGroup.keyColumnIndex : (columnGroup.keyColumnIndex + 1));
            }
        }
        return new ColumnGroup(columnGroup.startColumnIndex + 1, columnGroup.columnSpan, columnGroup.keyColumnIndex + 1);
    })
    .forEach(columnGroup -> project.columnModel.columnGroups.set(project.columnModel.columnGroups.indexOf(columnGroup), columnGroup));