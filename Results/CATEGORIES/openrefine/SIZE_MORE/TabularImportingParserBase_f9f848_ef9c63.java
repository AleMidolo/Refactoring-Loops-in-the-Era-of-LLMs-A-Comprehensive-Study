for (int c = 0; c < cells.size(); c++) {
    Column column = ImporterUtilities.getOrAllocateColumn(project, columnNames, c, hasOurOwnColumnNames);
    Object value = cells.get(c);
    if (value instanceof Cell) {
        row.setCell(column.getCellIndex(), (Cell) value);
        rowHasData = true;
    } else if (ExpressionUtils.isNonBlankData(value)) {
        Serializable storedValue;
        if (value instanceof String) {
            if (trimStrings) {
                value = CharMatcher.whitespace().trimFrom(((String) value));
            }
            storedValue = guessCellValueTypes ? ImporterUtilities.parseCellValue((String) value) : (String) value;
        } else {
            storedValue = ExpressionUtils.wrapStorable(value);
        }
        row.setCell(column.getCellIndex(), new Cell(storedValue, null));
        rowHasData = true;
    } else if (!storeBlankCellsAsNulls) {
        row.setCell(column.getCellIndex(), new Cell("", null));
    } else {
        row.setCell(column.getCellIndex(), null);
    }
}