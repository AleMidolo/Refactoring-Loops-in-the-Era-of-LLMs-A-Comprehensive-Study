sheets.stream()
    .map(sheet -> (ObjectNode) sheet)
    .map(sheetObj -> sheetObj.get("fileNameAndSheetIndex").asText().split("#"))
    .filter(fileNameAndSheetIndex -> fileNameAndSheetIndex[0].equals(fileSource))
    .forEach(fileNameAndSheetIndex -> {
        Sheet sheet = wb.getSheetAt(Integer.parseInt(fileNameAndSheetIndex[1]));
        int lastRow = sheet.getLastRowNum();
        TableDataReader dataReader = new TableDataReader() {
            int nextRow = 0;

            @Override
            public List<Object> getNextRowOfCells() throws IOException {
                if (nextRow > lastRow) {
                    return null;
                }
                List<Object> cells = new ArrayList<>();
                org.apache.poi.ss.usermodel.Row row = sheet.getRow(nextRow++);
                if (row != null) {
                    short lastCell = row.getLastCellNum();
                    for (short cellIndex = 0; cellIndex < lastCell; cellIndex++) {
                        Cell cell = null;
                        org.apache.poi.ss.usermodel.Cell sourceCell = row.getCell(cellIndex);
                        if (sourceCell != null) {
                            cell = extractCell(sourceCell, forceText);
                        }
                        cells.add(cell);
                    }
                }
                return cells;
            }
        };
        TabularImportingParserBase.readTable(project, metadata, job, dataReader, fileSource + "#" + sheet.getSheetName(), limit, options, exceptions);
    });