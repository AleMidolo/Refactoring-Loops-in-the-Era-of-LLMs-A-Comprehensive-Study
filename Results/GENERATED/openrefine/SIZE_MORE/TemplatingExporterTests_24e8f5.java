IntStream.range(0, 2).forEach(i -> {
    Row row = new Row(2);
    IntStream.range(0, 2).forEach(j -> {
        if (i == 1 && j == 0) {
            row.cells.add(new Cell(null, null));
        } else {
            row.cells.add(new Cell("row" + i + "cell" + j, null));
        }
    });
    project.rows.add(row);
});