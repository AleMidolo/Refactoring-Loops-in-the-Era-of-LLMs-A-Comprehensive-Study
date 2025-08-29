for (ColumnGroup group : columnGroups) {
    group.save(writer);
    writer.write('\n');
}