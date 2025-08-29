for (ColumnGroup group : columnModel.columnGroups) {
    if (group.keyColumnIndex >= 0) {
        KeyedGroup keyedGroup = new KeyedGroup();
        keyedGroup.keyCellIndex = columnModel.columns.get(group.keyColumnIndex).getCellIndex();
        keyedGroup.cellIndices = new int[group.columnSpan - 1];
        int c = 0;
        for (int i = 0; i < group.columnSpan; i++) {
            int columnIndex = group.startColumnIndex + i;
            if (columnIndex != group.keyColumnIndex && columnIndex < columnModel.columns.size()) {
                int cellIndex = columnModel.columns.get(columnIndex).getCellIndex();
                keyedGroup.cellIndices[c++] = cellIndex;
            }
        }
        keyedGroups.add(keyedGroup);
    }
}