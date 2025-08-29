IntStream.range(0, noOfRows)
    .mapToObj(i -> {
        Row row = new Row(noOfColumns);
        AtomicInteger k = new AtomicInteger(0);
        IntStream.range(0, noOfColumns)
            .forEach(j -> row.cells.add(k.getAndIncrement() < noOfNullFields ?
                    new Cell("", null) :
                    new Cell("row" + i + "cell" + j, null)));
        return row;
    })
    .forEach(project.rows::add);