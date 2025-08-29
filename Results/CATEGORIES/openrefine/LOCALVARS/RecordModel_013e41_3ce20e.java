for (int i = 0; i < group.columnSpan; i++) {
    int columnIndex = group.startColumnIndex + i;
    if (columnIndex != group.keyColumnIndex && columnIndex < columnModel.columns.size()) {
        int cellIndex = columnModel.columns.get(columnIndex).getCellIndex();
        keyedGroup.cellIndices[c++] = cellIndex;
    }
}