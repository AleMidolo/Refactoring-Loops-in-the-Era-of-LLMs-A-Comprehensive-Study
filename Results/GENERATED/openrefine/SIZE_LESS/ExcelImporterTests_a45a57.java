IntStream.range(0, SHEETS)
    .forEach(s -> {
        Sheet sheet = wb.createSheet("Test Sheet " + s);
        IntStream.range(0, ROWS)
            .forEach(row -> createDataRow(sheet, row, NOW, dateTimeStyle, dateStyle, intStyle, floatStyle, zeroStyle, otherStyle, currencyStyle, s));
    });