IntStream.range(0, noOfRows)
    .mapToObj(i -> {
        Row row = new Row(noOfColumns);
        IntStream.range(0, noOfColumns)
            .forEach(j -> row.cells.add(new Cell("row" + i + "cell" + j, null)));
        return row;
    })
    .forEach(project.rows::add);