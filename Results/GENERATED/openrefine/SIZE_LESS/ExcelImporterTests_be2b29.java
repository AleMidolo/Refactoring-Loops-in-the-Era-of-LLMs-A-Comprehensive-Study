IntStream.range(0, extra_columns)
    .forEach(i -> {
        c = r.createCell(col++);
        c.setCellValue(i + extra_columns);
    });