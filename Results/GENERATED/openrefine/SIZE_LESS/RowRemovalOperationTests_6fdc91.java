IntStream.range(0, 5)
    .mapToObj(i -> {
        Row row = new Row(5);
        row.setCell(0, new Cell(i < 4 ? "a" : "b", null));
        return row;
    })
    .forEach(projectIssue567.rows::add);