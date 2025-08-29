for (Column c : _removedColumns) {
    c.save(writer);
    writer.write('\n');
}