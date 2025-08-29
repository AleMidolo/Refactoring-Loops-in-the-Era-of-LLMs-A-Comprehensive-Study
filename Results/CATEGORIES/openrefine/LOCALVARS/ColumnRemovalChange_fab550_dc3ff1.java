for (int i = 0; i < oldCellCount; i++) {
    line = reader.readLine();
    if (line != null) {
        oldCells[i] = CellAtRow.load(line, pool);
    }
}