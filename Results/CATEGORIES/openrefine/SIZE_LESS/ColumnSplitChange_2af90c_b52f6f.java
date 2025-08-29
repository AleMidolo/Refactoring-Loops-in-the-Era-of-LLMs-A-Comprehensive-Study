for (int i = 0; i < _rowIndices.size(); i++) {
    int r = _rowIndices.get(i);
    Row oldRow = _oldRows.get(i);
    project.rows.set(r, oldRow);
}