for (int i = 0; i < extra_columns; i++) {
    c = r.createCell(col++);
    c.setCellValue(i + extra_columns);
}