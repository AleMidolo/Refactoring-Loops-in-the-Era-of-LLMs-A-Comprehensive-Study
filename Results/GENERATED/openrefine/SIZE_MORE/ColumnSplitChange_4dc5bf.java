_tuples.forEach(tuple -> {
    writer.write(Integer.toString(tuple.size()));
    writer.write('\n');
    tuple.forEach(value -> {
        if (value == null) {
            writer.write("null");
        } else if (value instanceof String) {
            writer.write(ParsingUtilities.mapper.writeValueAsString((String) value));
        } else {
            writer.write(value.toString());
        }
        writer.write('\n');
    });
});