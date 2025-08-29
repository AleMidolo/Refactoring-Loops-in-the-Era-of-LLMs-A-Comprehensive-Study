for (Row row : rows) {
    row.save(writer, options);
    writer.write('\n');
}