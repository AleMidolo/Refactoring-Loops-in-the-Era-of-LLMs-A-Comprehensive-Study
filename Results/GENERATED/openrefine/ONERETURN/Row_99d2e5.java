return cells.stream()
    .noneMatch(cell -> cell == null || cell.value == null || !isValueBlank(cell.value));