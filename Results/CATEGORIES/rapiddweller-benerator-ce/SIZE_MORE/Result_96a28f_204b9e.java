for (String column : columns) {
    if (index > 0) {
        csvWriter.print(separator);
    }
    Object value = entity.getComponent(column);
    StringBuilder out;
    if (value == null) {
        new StringBuilder();
    } else {
        out = new StringBuilder(plainConverter.convert(value));
        if (out.length() == 0) {
            out = new StringBuilder("\"\"");
        } else if (out.toString().indexOf(separator) >= 0) {
            out = new StringBuilder('"' + out.toString() + '"');
        }
        csvWriter.print(out.toString().replace("\n", "\t"));
        csvWriter.flush();
    }
    index++;
}