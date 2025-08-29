Arrays.stream(cells)
    .forEach(cellValue -> {
        HSSFCell cell = row.createCell(i);
        Object value = cellValue;
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
    });