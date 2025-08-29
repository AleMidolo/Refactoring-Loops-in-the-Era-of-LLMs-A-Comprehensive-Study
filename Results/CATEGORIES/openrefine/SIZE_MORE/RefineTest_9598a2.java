for (int i = 0; i != actual.rows.size(); i++) {
    Row actualRow = actual.rows.get(i);
    Row expectedRow = expected.rows.get(i);
    for (int j = 0; j != columnCount; j++) {
        Cell actualCell = actualRow.getCell(actualCellIndices.get(j));
        Cell expectedCell = expectedRow.getCell(expectedCellIndices.get(j));
        if (expectedCell != null && expectedCell.value instanceof Double && actualCell != null && actualCell.value != null) {
            assertEquals((double) actualCell.value, (double) expectedCell.value, EPSILON, String.format("mismatching cells in row %d, column '%s'", i, actual.columnModel.columns.get(j)));
        } else {
            assertEquals(actualCell == null ? null : actualCell.value, expectedCell == null ? null : expectedCell.value, String.format("mismatching cell values in row %d, column '%s'", i, actual.columnModel.columns.get(j)));
            assertEquals(actualCell == null ? null : actualCell.recon, expectedCell == null ? null : expectedCell.recon, String.format("mismatching recon in row %d, column '%s'", i, actual.columnModel.columns.get(j)));
        }
    }
}