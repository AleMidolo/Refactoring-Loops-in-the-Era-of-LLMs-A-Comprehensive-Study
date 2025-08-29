unchangedColumns.stream()
    .map(unchangedColumn -> {
        Object cellValue = oldRow.getCellValue(unchangedColumn.getCellIndex());
        return cellValue != null ? cellValue.toString() : "";
    })
    .collect(Collectors.joining("\0"));