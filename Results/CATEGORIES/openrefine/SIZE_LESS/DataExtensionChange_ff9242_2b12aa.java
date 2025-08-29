for (Row row : _newRows) {
    row.save(writer, options);
    writer.write('\n');
}