IntStream.range(0, 10)
    .mapToObj(i -> {
        Row row = new Row(1);
        row.setCell(0, new Cell(i < 5 ? "a" : new Integer(1), null));
        return row;
    })
    .forEach(project.rows::add);