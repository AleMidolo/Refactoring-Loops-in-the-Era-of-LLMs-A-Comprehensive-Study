IntStream.range(0, noOfRows)
    .mapToObj(i -> {
        Row row = new Row(noOfColumns);
        IntStream.range(0, noOfColumns)
            .forEach(j -> row.cells.add(new Cell(value, null));
        return row;
    })
    .forEach(row -> project.rows.add(row));