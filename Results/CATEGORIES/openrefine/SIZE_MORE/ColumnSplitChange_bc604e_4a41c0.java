for (int i = columnGroupCount - 1; i >= 0; i--) {
    ColumnGroup columnGroup = project.columnModel.columnGroups.get(i);
    _oldColumnGroups.add(columnGroup);
    if (columnGroup.startColumnIndex <= _columnIndex) {
        if (columnGroup.startColumnIndex + columnGroup.columnSpan > _columnIndex) {
            if (columnGroup.keyColumnIndex == _columnIndex) {
                if (_removeOriginalColumn) {
                    project.columnModel.columnGroups.remove(i);
                } else {
                    project.columnModel.columnGroups.set(i, new ColumnGroup(columnGroup.startColumnIndex, columnGroup.columnSpan + columnCountChange, columnGroup.keyColumnIndex));
                }
            } else {
                project.columnModel.columnGroups.set(i, new ColumnGroup(columnGroup.startColumnIndex, columnGroup.columnSpan + columnCountChange, columnGroup.keyColumnIndex < _columnIndex ? columnGroup.keyColumnIndex : (columnGroup.keyColumnIndex + columnCountChange)));
            }
        }
    } else {
        project.columnModel.columnGroups.set(i, new ColumnGroup(columnGroup.startColumnIndex + columnCountChange, columnGroup.columnSpan, columnGroup.keyColumnIndex + columnCountChange));
    }
}