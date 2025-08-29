for (int i = 0; i < cells.length; i++) {
    HSSFCell cell = row.createCell(i);
    Object value = cells[i];
    if (value instanceof Number) {
        double d = ((Number) value).doubleValue();
        if (d < 10) {
            cell.setCellStyle(smallCellStyle);
        } else {
            cell.setCellStyle(bigCellStyle);
        }
        cell.setCellValue(d);
    } else {
        cell.setCellValue(String.valueOf(value));
        if (style != null) {
            cell.setCellStyle(style);
        }
    }
}