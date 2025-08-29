for (int i = 0; i < columns.length; i++) {
    if (i > 0) {
        printer.print(separator);
    }
    Object value = entity.getComponent(columns[i]);
    String out;
    if (value == null) {
        out = getNullString();
    } else {
        out = CSVUtil.renderCell(plainConverter.convert(value), separator, quoteEmpty);
    }
    printer.print(out);
}