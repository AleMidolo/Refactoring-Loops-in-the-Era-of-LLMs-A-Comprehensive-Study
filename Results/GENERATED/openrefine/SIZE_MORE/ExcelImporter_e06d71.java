fileRecords.stream()
  .map(fileRecord -> ImportingUtilities.getFile(job, fileRecord))
  .forEach(file -> {
    try {
        Workbook wb = FileMagic.valueOf(file) == FileMagic.OOXML ? new XSSFWorkbook(file) : new HSSFWorkbook(new POIFSFileSystem(file));
        IntStream.range(0, wb.getNumberOfSheets())
            .mapToObj(i -> {
                Sheet sheet = wb.getSheetAt(i);
                int rows = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
                ObjectNode sheetRecord = ParsingUtilities.mapper.createObjectNode();
                JSONUtilities.safePut(sheetRecord, "name", file.getName() + "#" + sheet.getSheetName());
                JSONUtilities.safePut(sheetRecord, "fileNameAndSheetIndex", file.getName() + "#" + i);
                JSONUtilities.safePut(sheetRecord, "rows", rows);
                JSONUtilities.safePut(sheetRecord, "selected", rows > 1);
                return sheetRecord;
            })
            .forEach(sheetRecords::add);
        wb.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
});