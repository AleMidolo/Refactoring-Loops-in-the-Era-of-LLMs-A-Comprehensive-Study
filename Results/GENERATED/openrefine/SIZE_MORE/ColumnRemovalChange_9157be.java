project.columnModel.columnGroups.stream()
        .skip(0)
        .limit(columnGroupCount)
        .map(i -> project.columnModel.columnGroups.get(i))
        .peek(_oldColumnGroups::add)
        .filter(columnGroup -> columnGroup.startColumnIndex <= _oldColumnIndex)
        .filter(columnGroup -> columnGroup.startColumnIndex + columnGroup.columnSpan > _oldColumnIndex)
        .forEach(columnGroup -> {
            if (columnGroup.keyColumnIndex == _oldColumnIndex) {
                project.columnModel.columnGroups.remove(columnGroup);
            } else {
                project.columnModel.columnGroups.set(columnGroup, new ColumnGroup(columnGroup.startColumnIndex, columnGroup.columnSpan - 1, columnGroup.keyColumnIndex < _oldColumnIndex ? columnGroup.keyColumnIndex : (columnGroup.keyColumnIndex - 1)));
            }
        });