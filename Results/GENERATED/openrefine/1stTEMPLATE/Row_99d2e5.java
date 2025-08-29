boolean anyValidCellValue = cells.stream()
                                      .anyMatch(cell -> cell != null && cell.value != null && !isValueBlank(cell.value));