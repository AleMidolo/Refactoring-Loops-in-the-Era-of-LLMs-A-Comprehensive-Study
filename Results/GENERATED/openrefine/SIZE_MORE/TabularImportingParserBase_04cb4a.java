cells.stream()
    .map(cell -> cell == null ? "" : (cell instanceof Cell ? CharMatcher.whitespace().trimFrom(((Cell) cell).value.toString()) : CharMatcher.whitespace().trimFrom(cell.toString())))
    .forEach(cellName -> ImporterUtilities.appendColumnName(columnNames, cells.indexOf(cellName), cellName));