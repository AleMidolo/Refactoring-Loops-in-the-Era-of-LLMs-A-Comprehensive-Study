IntStream.range(0, SHEETS)
    .forEach(s -> {
        Sheet sheet = wb.createSheet("Test Sheet " + s);
        IntStream.range(0, ROWS)
            .forEach(row -> createDataRow(sheet, row, date, dateTimeStyle, dateStyle, intStyle, floatStyle, zeroStyle, otherStyle, currencyStyle, 0));
    });