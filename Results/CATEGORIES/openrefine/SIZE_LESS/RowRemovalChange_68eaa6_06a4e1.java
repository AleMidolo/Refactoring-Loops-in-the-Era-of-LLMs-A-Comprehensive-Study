for (int i = 0; i < count; i++) {
    int index = _rowIndices.get(i);
    Row row = project.rows.remove(index + offset);
    _rows.add(row);
    offset--;
}