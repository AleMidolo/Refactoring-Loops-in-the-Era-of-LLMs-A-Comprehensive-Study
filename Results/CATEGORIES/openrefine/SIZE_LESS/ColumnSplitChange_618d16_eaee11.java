for (int i = 0; i < _rowIndices.size(); i++) {
    int r = _rowIndices.get(i);
    Row newRow = _newRows.get(i);
    project.rows.set(r, newRow);
}