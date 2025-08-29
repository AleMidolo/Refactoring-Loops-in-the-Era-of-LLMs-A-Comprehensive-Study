for (int j = 0; j < row.cells.size(); j++) {
    Cell cell = row.getCell(j);
    assertEquals(grid[i][j], cell.value);
}