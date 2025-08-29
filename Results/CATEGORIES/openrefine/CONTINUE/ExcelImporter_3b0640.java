for (int i = 0; i < sheets.size(); i++) {
    String[] fileNameAndSheetIndex = new String[2];
    ObjectNode sheetObj = (ObjectNode) sheets.get(i);
    fileNameAndSheetIndex = sheetObj.get("fileNameAndSheetIndex").asText().split("#");
    if (!fileNameAndSheetIndex[0].equals(fileSource))
        continue;
    final Sheet sheet = wb.getSheetAt(Integer.parseInt(fileNameAndSheetIndex[1]));
    final int lastRow = sheet.getLastRowNum();
    TableDataReader dataReader = new TableDataReader() {

        int nextRow = 0;

        @Override
        public List<Object> getNextRowOfCells() throws IOException {
            if (nextRow > lastRow) {
                return null;
            }
            List<Object> cells = new ArrayList<Object>();
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
}