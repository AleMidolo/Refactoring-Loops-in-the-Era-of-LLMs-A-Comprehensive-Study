row.cells.stream()
    .map(cell -> grid[i][row.cells.indexOf(cell)])
    .forEach(cell -> assertEquals(cell.value));