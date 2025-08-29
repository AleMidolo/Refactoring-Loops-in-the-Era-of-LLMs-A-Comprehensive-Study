IntStream.range(0, sheets != null ? sheets.size() : 0)
    .mapToObj(i -> JSONUtilities.getObjectElement(sheets, i))
    .map(sheetObj -> sheetObj.get("fileNameAndSheetIndex").asText().split("#"))
    .filter(fileNameAndSheetIndex -> fileNameAndSheetIndex[0].equals(fileSource))
    .forEach(fileNameAndSheetIndex -> {
        OdfTable table = tables.get(Integer.parseInt(fileNameAndSheetIndex[1]));
        int lastRow = table.getRowCount();
        TableDataReader dataReader = new TableDataReader() {

            int nextRow = 0;

            @Override
            public List<Object> getNextRowOfCells() {
                if (nextRow > lastRow) {
                    return null;
                }
                List<Object> cells = new ArrayList<>();
                OdfTableRow row = table.getRowByIndex(nextRow++);
                int maxCol = 0;
                if (row != null) {
                    int lastCell = row.getCellCount();
                    for (int cellIndex = 0; cellIndex <= lastCell; cellIndex++) {
                        Cell cell = null;
                        OdfTableCell sourceCell = row.getCellByIndex(cellIndex);
                        if (sourceCell != null) {
                            cell = extractCell(sourceCell);
                        }
                        cells.add(cell);
                        if (cell != null && cellIndex > maxCol) {
                            maxCol = cellIndex;
                        }
                    }
                }
                return cells.subList(0, maxCol + 1);
            }
        };
        TabularImportingParserBase.readTable(project, metadata, job, dataReader, fileSource + "#" + table.getTableName(), limit, options, exceptions);
    });