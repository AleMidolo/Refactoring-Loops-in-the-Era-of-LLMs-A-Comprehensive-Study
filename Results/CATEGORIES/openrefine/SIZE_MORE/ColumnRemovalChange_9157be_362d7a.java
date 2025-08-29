for (int i = columnGroupCount - 1; i >= 0; i--) {
    ColumnGroup columnGroup = project.columnModel.columnGroups.get(i);
    _oldColumnGroups.add(columnGroup);
    if (columnGroup.startColumnIndex <= _oldColumnIndex) {
        if (columnGroup.startColumnIndex + columnGroup.columnSpan > _oldColumnIndex) {
            if (columnGroup.keyColumnIndex == _oldColumnIndex) {
                project.columnModel.columnGroups.remove(i);
            } else {
                project.columnModel.columnGroups.set(i, new ColumnGroup(columnGroup.startColumnIndex, columnGroup.columnSpan - 1, columnGroup.keyColumnIndex < _oldColumnIndex ? columnGroup.keyColumnIndex : (columnGroup.keyColumnIndex - 1)));
            }
        }
    } else {
        project.columnModel.columnGroups.set(i, new ColumnGroup(columnGroup.startColumnIndex - 1, columnGroup.columnSpan, columnGroup.keyColumnIndex - 1));
    }
}