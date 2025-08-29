unchangedColumns.stream()
    .map(unchangedColumn -> {
        Object cellValue = oldRow.getCellValue(unchangedColumn.getCellIndex());
        return cellValue != null ? cellValue.toString() : "";
    })
    .filter(cellValue -> !cellValue.isEmpty())
    .collect(Collectors.joining("\0"));