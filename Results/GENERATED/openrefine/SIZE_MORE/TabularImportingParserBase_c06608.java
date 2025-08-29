cells.stream()
    .map(cell -> {
        if (cell == null) {
            return "";
        } else if (cell instanceof Cell) {
            return CharMatcher.whitespace().trimFrom(((Cell) cell).value.toString());
        } else {
            return CharMatcher.whitespace().trimFrom(cell.toString());
        }
    })
    .forEach(columnName -> ImporterUtilities.appendColumnName(columnNames, c, columnName));