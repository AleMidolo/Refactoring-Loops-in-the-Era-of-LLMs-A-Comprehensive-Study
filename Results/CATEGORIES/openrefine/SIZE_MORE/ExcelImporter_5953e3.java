for (short cellIndex = 0; cellIndex < lastCell; cellIndex++) {
    Cell cell = null;
    org.apache.poi.ss.usermodel.Cell sourceCell = row.getCell(cellIndex);
    if (sourceCell != null) {
        cell = extractCell(sourceCell, forceText);
    }
    cells.add(cell);
}