for (int i = 0; i < sheetCount; i++) {
    Sheet sheet = wb.getSheetAt(i);
    int rows = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
    ObjectNode sheetRecord = ParsingUtilities.mapper.createObjectNode();
    JSONUtilities.safePut(sheetRecord, "name", file.getName() + "#" + sheet.getSheetName());
    JSONUtilities.safePut(sheetRecord, "fileNameAndSheetIndex", file.getName() + "#" + i);
    JSONUtilities.safePut(sheetRecord, "rows", rows);
    if (rows > 1) {
        JSONUtilities.safePut(sheetRecord, "selected", true);
    } else {
        JSONUtilities.safePut(sheetRecord, "selected", false);
    }
    JSONUtilities.append(sheetRecords, sheetRecord);
}