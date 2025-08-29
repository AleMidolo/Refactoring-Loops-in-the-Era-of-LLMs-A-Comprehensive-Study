for (ReconEntry entry : entries) {
    if (recon == null) {
        Cell oldCell = entry.cell;
        logger.warn("We have a null recon here" + " " + oldCell + " " + entry.rowIndex);
        continue;
    }
    Cell oldCell = entry.cell;
    Cell newCell = new Cell(oldCell.value, recon);
    CellChange cellChange = new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
    cellChanges.add(cellChange);
}