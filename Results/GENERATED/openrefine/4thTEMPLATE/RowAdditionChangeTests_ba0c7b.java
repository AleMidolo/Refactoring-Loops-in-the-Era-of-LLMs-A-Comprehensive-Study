row.cells.stream()
    .forEach(cell -> assertEquals(grid[i][row.cells.indexOf(cell)], cell.value));