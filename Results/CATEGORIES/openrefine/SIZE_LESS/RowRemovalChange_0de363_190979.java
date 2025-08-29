for (Row row : _rows) {
    row.save(writer, options);
    writer.write('\n');
}