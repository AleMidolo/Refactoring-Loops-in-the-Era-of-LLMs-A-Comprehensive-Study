IntStream.range(0, group.columnSpan)
    .mapToObj(i -> group.startColumnIndex + i)
    .filter(columnIndex -> columnIndex != group.keyColumnIndex && columnIndex < columnModel.columns.size())
    .map(columnIndex -> columnModel.columns.get(columnIndex).getCellIndex())
    .forEach(cellIndex -> keyedGroup.cellIndices[c++] = cellIndex);