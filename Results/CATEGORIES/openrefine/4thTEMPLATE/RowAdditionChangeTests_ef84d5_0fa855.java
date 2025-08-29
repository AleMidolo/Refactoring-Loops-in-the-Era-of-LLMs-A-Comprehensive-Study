for (int j = 0; j < row.cells.size(); j++) {
    Cell cell = row.cells.get(j);
    assertEquals(cell.value, grid[i][j]);
}