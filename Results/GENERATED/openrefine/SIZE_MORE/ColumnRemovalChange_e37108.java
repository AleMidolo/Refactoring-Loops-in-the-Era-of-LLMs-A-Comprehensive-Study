IntStream.range(0, columnGroupCount)
    .mapToObj(i -> project.columnModel.columnGroups.get(columnGroupCount - i - 1))
    .peek(_oldColumnGroups::add)
    .filter(columnGroup -> columnGroup.startColumnIndex <= _oldColumnIndex)
    .filter(columnGroup -> columnGroup.startColumnIndex + columnGroup.columnSpan > _oldColumnIndex)
    .forEach(columnGroup -> {
        if (columnGroup.keyColumnIndex == _oldColumnIndex) {
            project.columnModel.columnGroups.remove(columnGroup);
        } else {
            int keyColumnIndex = columnGroup.keyColumnIndex < _oldColumnIndex ? columnGroup.keyColumnIndex : (columnGroup.keyColumnIndex - 1);
            project.columnModel.columnGroups.set(columnGroup, new ColumnGroup(columnGroup.startColumnIndex, columnGroup.columnSpan - 1, keyColumnIndex));
        }
    });