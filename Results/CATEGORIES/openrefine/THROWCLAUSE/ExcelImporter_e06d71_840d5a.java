for (int index = 0; index < fileRecords.size(); index++) {
    ObjectNode fileRecord = fileRecords.get(index);
    File file = ImportingUtilities.getFile(job, fileRecord);
    Workbook wb = null;
    try {
        wb = FileMagic.valueOf(file) == FileMagic.OOXML ? new XSSFWorkbook(file) : new HSSFWorkbook(new POIFSFileSystem(file));
        int sheetCount = wb.getNumberOfSheets();
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
    } finally {
        if (wb != null) {
            wb.close();
        }
    }
}