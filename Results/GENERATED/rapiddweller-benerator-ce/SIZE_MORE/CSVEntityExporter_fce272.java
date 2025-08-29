Arrays.stream(columns)
    .forEach(i -> {
        if (i > 0) {
            printer.print(separator);
        }
        Object value = entity.getComponent(i);
        String out = (value == null) ? getNullString() : CSVUtil.renderCell(plainConverter.convert(value), separator, quoteEmpty);
        printer.print(out);
    });