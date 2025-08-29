for (Row row : _additionalRows) {
    row.save(writer, options);
    writer.write('\n');
}