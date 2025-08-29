for (Sheet sheet : worksheetEntries) {
    ObjectNode worksheetO = ParsingUtilities.mapper.createObjectNode();
    JSONUtilities.safePut(worksheetO, "name", sheet.getProperties().getTitle());
    JSONUtilities.safePut(worksheetO, "rows", sheet.getProperties().getGridProperties().getRowCount());
    JSONUtilities.safePut(worksheetO, "link", "https://sheets.googleapis.com/v4/spreadsheets/" + spreadSheetId + "/values/" + sheet.getProperties().getTitle());
    JSONUtilities.safePut(worksheetO, "worksheetIndex", workSheetIndex++);
    JSONUtilities.append(worksheets, worksheetO);
}