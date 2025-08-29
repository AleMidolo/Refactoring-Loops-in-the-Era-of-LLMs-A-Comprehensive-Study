for (int i = 0; i < newCellCount; i++) {
    line = reader.readLine();
    if (line != null) {
        newCells.add(CellAtRow.load(line, pool));
    }
}