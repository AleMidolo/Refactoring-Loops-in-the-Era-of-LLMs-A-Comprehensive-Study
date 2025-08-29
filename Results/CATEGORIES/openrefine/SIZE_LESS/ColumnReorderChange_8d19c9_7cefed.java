for (Column c : _newColumns) {
    c.save(writer);
    writer.write('\n');
}