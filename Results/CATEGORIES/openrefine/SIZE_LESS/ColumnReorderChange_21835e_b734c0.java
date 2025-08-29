for (int i = 0; i < _oldCells.length; i++) {
    Row row = project.rows.get(_oldCells[i].row);
    row.setCell(_oldCells[i].cellIndex, _oldCells[i].cell);
}