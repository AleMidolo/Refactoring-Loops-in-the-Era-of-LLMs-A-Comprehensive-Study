grid.stream()
    .forEach(rawRow -> {
        assertEquals(columnNames.length, rawRow.length, "Unexpected row length in test grid data");
        Row row = new Row(columnNames.length);
        IntStream.range(0, columnNames.length)
            .forEach(i -> {
                Serializable rawCell = rawRow[i];
                if (rawCell == null || rawCell instanceof Cell) {
                    row.setCell(i, (Cell) rawCell);
                } else {
                    row.setCell(i, new Cell(rawCell, null));
                }
            });
        project.rows.add(row);
    });