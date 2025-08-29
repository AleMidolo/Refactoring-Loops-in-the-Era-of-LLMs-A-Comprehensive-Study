for (Column column : columns) {
    column.save(writer);
    writer.write('\n');
}