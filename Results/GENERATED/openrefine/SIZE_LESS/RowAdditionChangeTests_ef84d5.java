row.cells.stream()
    .forEach(cell -> assertEquals(cell.value, grid[i][row.cells.indexOf(cell)]));