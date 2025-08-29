for (int i = 0; i != columnNames.length; i++) {
    Serializable rawCell = rawRow[i];
    if (rawCell == null || rawCell instanceof Cell) {
        row.setCell(i, (Cell) rawCell);
    } else {
        row.setCell(i, new Cell(rawCell, null));
    }
}