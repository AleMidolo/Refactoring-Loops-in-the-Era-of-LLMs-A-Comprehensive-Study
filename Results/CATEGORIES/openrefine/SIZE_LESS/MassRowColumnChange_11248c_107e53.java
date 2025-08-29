for (Column column : _newColumns) {
    column.save(writer);
    writer.write('\n');
}