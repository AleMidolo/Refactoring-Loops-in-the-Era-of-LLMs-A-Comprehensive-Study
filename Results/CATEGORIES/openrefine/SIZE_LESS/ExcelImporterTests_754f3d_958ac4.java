for (int s = 0; s < SHEETS; s++) {
    Sheet sheet = wb.createSheet("Test Sheet " + s);
    for (int row = 0; row < ROWS; row++) {
        createDataRow(sheet, row, date, dateTimeStyle, dateStyle, intStyle, floatStyle, zeroStyle, otherStyle, currencyStyle, 0);
    }
}