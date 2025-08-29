for (int i = 0; i < project.rows.size(); i++) {
    Row row = project.rows.get(i);
    for (int j = 0; j < row.cells.size(); j++) {
        Cell cell = row.cells.get(j);
        assertEquals(cell.value, grid[i][j]);
    }
}