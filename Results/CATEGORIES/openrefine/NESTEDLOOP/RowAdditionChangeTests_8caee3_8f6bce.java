for (int i = 0; i < grid.length; i++) {
    Row row = project.rows.get(i + newRows.size());
    for (int j = 0; j < row.cells.size(); j++) {
        Cell cell = row.getCell(j);
        assertEquals(grid[i][j], cell.value);
    }
}