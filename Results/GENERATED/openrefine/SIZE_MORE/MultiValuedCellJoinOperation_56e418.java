project.rows.subList(r, r2).stream()
    .map(row -> row.getCellValue(cellIndex))
    .filter(ExpressionUtils::isNonBlankData)
    .map(Object::toString)
    .collect(Collectors.joining(_separator, "", ""));