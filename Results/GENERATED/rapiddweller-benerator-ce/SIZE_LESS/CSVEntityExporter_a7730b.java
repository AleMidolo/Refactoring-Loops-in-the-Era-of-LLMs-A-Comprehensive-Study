IntStream.range(0, columns.length)
    .forEach(i -> {
        if (i > 0) {
            printer.print(separator);
        }
        printer.print(columns[i]);
    });