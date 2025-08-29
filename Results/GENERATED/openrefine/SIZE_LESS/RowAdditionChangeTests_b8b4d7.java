project.rows.forEach(row -> {
    row.cells.forEach(cell -> {
        assertEquals(cell.value, grid[project.rows.indexOf(row)][row.cells.indexOf(cell)]);
    });
});