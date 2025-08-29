row.stream()
    .filter(Objects::nonNull)
    .forEach(cell -> realRow.setCell(row.indexOf(cell), cell);