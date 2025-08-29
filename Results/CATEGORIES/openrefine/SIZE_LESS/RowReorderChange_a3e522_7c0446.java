for (int newIndex = 0; newIndex < count; newIndex++) {
    int oldIndex = _rowIndices.get(newIndex);
    Row row = newRows.get(newIndex);
    oldRows.set(oldIndex, row);
}