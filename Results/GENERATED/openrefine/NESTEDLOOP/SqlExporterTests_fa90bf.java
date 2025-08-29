IntStream.range(0, noOfRows)
    .mapToObj(i -> {
        Row row = new Row(noOfColumns);
        AtomicInteger k = new AtomicInteger(0);
        IntStream.range(0, noOfColumns)
            .mapToObj(j -> {
                if (k.get() < noOfNullFields) {
                    k.getAndIncrement();
                    return new Cell("", null);
                } else {
                    return new Cell("row" + i + "cell" + j, null);
                }
            })
            .forEach(row.cells::add);
        return row;
    })
    .forEach(project.rows::add);