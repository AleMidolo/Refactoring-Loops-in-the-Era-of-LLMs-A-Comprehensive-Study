for (Column c : _oldColumns) {
    c.save(writer);
    writer.write('\n');
}