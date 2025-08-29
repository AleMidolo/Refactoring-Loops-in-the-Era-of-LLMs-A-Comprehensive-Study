fileRecords.stream()
        .map(fileRecord -> ImportingUtilities.getFile(job, fileRecord))
        .map(file -> {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        })
        .filter(Objects::nonNull)
        .map(odfDoc -> OdfDocument.loadDocument(odfDoc))
        .map(OdfDocument::getTableList)
        .flatMap(List::stream)
        .map(sheet -> {
            int rows = sheet.getRowCount();
            ObjectNode sheetRecord = ParsingUtilities.mapper.createObjectNode();
            JSONUtilities.safePut(sheetRecord, "name", file.getName() + "#" + sheet.getTableName());
            JSONUtilities.safePut(sheetRecord, "fileNameAndSheetIndex", file.getName() + "#" + i);
            JSONUtilities.safePut(sheetRecord, "rows", rows);
            JSONUtilities.safePut(sheetRecord, "selected", rows > 0);
            return sheetRecord;
        })
        .forEach(sheetRecords::add);