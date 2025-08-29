for (int r3 = r; r3 < r2; r3++) {
    Object value = project.rows.get(r3).getCellValue(cellIndex);
    if (ExpressionUtils.isNonBlankData(value)) {
        if (sb.length() > 0) {
            sb.append(_separator);
        }
        sb.append(value.toString());
    }
}