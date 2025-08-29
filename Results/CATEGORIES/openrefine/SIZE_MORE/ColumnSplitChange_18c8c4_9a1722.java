for (Serializable value : tuple) {
    if (value == null) {
        writer.write("null");
    } else if (value instanceof String) {
        writer.write(ParsingUtilities.mapper.writeValueAsString((String) value));
    } else {
        writer.write(value.toString());
    }
    writer.write('\n');
}