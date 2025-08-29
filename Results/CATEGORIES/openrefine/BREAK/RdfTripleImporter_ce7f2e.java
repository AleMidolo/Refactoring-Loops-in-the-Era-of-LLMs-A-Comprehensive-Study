for (Row row : rows) {
    if (!ExpressionUtils.isNonBlankData(row.getCellValue(cellIndex))) {
        row.setCell(cellIndex, new Cell(object, null));
        object = null;
        break;
    }
}