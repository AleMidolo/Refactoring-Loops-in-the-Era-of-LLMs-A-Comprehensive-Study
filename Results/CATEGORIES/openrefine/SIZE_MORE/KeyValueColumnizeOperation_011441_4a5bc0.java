for (int c = 0; c < unchangedColumns.size(); c++) {
    Column unchangedColumn = unchangedColumns.get(c);
    Object cellValue = oldRow.getCellValue(unchangedColumn.getCellIndex());
    if (c > 0) {
        sb.append('\0');
    }
    if (cellValue != null) {
        sb.append(cellValue.toString());
    }
}