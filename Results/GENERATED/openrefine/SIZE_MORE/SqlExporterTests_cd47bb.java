IntStream.range(0, noOfColumns)
    .forEach(j -> {
        if (k < noOfNullFields) {
            row.cells.add(new Cell("", null));
            k++;
        } else {
            row.cells.add(new Cell("row" + i + "cell" + j, null));
        }
    });