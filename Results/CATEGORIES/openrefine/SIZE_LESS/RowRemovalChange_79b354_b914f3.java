for (int i = 0; i < count; i++) {
    int index = _rowIndices.get(i);
    Row row = _rows.get(i);
    project.rows.add(index, row);
}