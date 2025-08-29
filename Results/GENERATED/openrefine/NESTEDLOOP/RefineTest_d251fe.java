grid.stream()
    .forEach(rawRow -> {
        assertEquals(columnNames.length, rawRow.length, "Unexpected row length in test grid data");
        Row row = new Row(columnNames.length);
        IntStream.range(0, columnNames.length)
            .forEach(i -> {
                Serializable rawCell = rawRow[i];
                row.setCell(i, (rawCell == null || rawCell instanceof Cell) ? (Cell) rawCell : new Cell(rawCell, null));
            });
        project.rows.add(row);
    });