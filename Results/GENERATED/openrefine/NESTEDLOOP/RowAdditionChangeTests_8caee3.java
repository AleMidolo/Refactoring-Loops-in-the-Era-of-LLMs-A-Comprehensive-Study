IntStream.range(0, grid.length)
         .forEach(i -> {
              Row row = project.rows.get(i + newRows.size());
              IntStream.range(0, row.cells.size())
                       .forEach(j -> {
                            Cell cell = row.getCell(j);
                            assertEquals(grid[i][j], cell.value);
                       });
         });