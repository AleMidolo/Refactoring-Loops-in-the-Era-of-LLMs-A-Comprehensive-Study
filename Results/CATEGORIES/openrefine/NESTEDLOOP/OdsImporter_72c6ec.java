for (ObjectNode fileRecord : fileRecords) {
    File file = ImportingUtilities.getFile(job, fileRecord);
    InputStream is = new FileInputStream(file);
    odfDoc = OdfDocument.loadDocument(is);
    List<OdfTable> tables = odfDoc.getTableList();
    int sheetCount = tables.size();
    for (int i = 0; i < sheetCount; i++) {
        OdfTable sheet = tables.get(i);
        int rows = sheet.getRowCount();
        ObjectNode sheetRecord = ParsingUtilities.mapper.createObjectNode();
        JSONUtilities.safePut(sheetRecord, "name", file.getName() + "#" + sheet.getTableName());
        JSONUtilities.safePut(sheetRecord, "fileNameAndSheetIndex", file.getName() + "#" + i);
        JSONUtilities.safePut(sheetRecord, "rows", rows);
        JSONUtilities.safePut(sheetRecord, "selected", rows > 0);
        JSONUtilities.append(sheetRecords, sheetRecord);
    }
}