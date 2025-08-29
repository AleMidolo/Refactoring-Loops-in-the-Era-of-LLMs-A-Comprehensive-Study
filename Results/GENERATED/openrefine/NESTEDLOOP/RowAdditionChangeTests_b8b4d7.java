project.rows.stream()
    .forEach(row -> IntStream.range(0, row.cells.size())
        .forEach(j -> assertEquals(row.cells.get(j).value, grid[project.rows.indexOf(row)][j]));