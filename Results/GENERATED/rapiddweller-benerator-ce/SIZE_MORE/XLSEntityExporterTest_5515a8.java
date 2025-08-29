IntStream.range(0, values.length)
    .forEach(i -> {
        assert row != null;
        HSSFCell cell = row.getCell(i);
        Object expectedContent = values[i];
        if (expectedContent == null) {
            assertNull(cell);
        } else if (expectedContent instanceof String) {
            assertEquals(CellType.STRING, cell.getCellType());
            assertEquals(expectedContent, cell.getStringCellValue());
        } else if (expectedContent instanceof Number) {
            assertEquals(CellType.NUMERIC, cell.getCellType());
            assertEquals(((Number) expectedContent).doubleValue(), cell.getNumericCellValue(), 0);
        } else if (expectedContent instanceof Boolean) {
            assertEquals(CellType.BOOLEAN, cell.getCellType());
            assertEquals(expectedContent, cell.getBooleanCellValue());
        } else if (expectedContent instanceof Date) {
            assertEquals(CellType.NUMERIC, cell.getCellType());
            assertEquals(((Date) expectedContent).getTime() / 1000, cell.getDateCellValue().getTime() / 1000);
        } else {
            throw BeneratorExceptionFactory.getInstance().programmerUnsupported("Type not supported: " + expectedContent.getClass());
        }
    });