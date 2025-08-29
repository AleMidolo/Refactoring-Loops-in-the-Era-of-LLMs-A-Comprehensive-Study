return currentRows.stream()
    .filter(row -> row.getCell(index) == null)
    .findFirst()
    .orElse(null);