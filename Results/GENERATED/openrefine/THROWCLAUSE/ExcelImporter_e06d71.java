fileRecords.stream()
    .map(fileRecord -> ImportingUtilities.getFile(job, fileRecord))
    .forEach(file -> {
        Workbook wb = null;
        try {
            wb = FileMagic.valueOf(file) == FileMagic.OOXML ? new XSSFWorkbook(file) : new HSSFWorkbook(new POIFSFileSystem(file));
            int sheetCount = wb.getNumberOfSheets();
            IntStream.range(0, sheetCount)
                .mapToObj(i -> wb.getSheetAt(i))
                .forEach(sheet -> {
                    int rows = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
                    ObjectNode sheetRecord = ParsingUtilities.mapper.createObjectNode();
                    JSONUtilities.safePut(sheetRecord, "name", file.getName() + "#" + sheet.getSheetName());
                    JSONUtilities.safePut(sheetRecord, "fileNameAndSheetIndex", file.getName() + "#" + i);
                    JSONUtilities.safePut(sheetRecord, "rows", rows);
                    JSONUtilities.safePut(sheetRecord, "selected", rows > 1);
                    JSONUtilities.append(sheetRecords, sheetRecord);
                });
        } finally {
            if (wb != null) {
                wb.close();
            }
        }
    });