for (int c = 0; c < cells.size(); c++) {
    Object cell = cells.get(c);
    String columnName;
    if (cell == null) {
        columnName = "";
    } else if (cell instanceof Cell) {
        columnName = CharMatcher.whitespace().trimFrom(((Cell) cell).value.toString());
    } else {
        columnName = CharMatcher.whitespace().trimFrom(cell.toString());
    }
    ImporterUtilities.appendColumnName(columnNames, c, columnName);
}