IntStream.range(0, sheetCount)
    .mapToObj(i -> {
        OdfTable sheet = tables.get(i);
        int rows = sheet.getRowCount();
        ObjectNode sheetRecord = ParsingUtilities.mapper.createObjectNode();
        JSONUtilities.safePut(sheetRecord, "name", file.getName() + "#" + sheet.getTableName());
        JSONUtilities.safePut(sheetRecord, "fileNameAndSheetIndex", file.getName() + "#" + i);
        JSONUtilities.safePut(sheetRecord, "rows", rows);
        JSONUtilities.safePut(sheetRecord, "selected", rows > 0);
        return sheetRecord;
    })
    .forEach(sheetRecords::add);