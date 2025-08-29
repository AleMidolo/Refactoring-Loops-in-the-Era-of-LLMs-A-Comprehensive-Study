for (Column column : _oldColumns) {
    column.save(writer);
    writer.write('\n');
}