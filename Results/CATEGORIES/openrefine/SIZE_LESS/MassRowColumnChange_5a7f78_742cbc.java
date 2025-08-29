for (Row row : _oldRows) {
    row.save(writer, options);
    writer.write('\n');
}