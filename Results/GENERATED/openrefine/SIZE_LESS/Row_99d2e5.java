return cells.stream()
    .filter(cell -> cell != null && cell.value != null && !isValueBlank(cell.value))
    .findFirst()
    .isPresent();