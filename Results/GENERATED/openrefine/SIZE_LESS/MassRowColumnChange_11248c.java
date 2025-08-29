_newColumns.forEach(column -> {
    column.save(writer);
    writer.write('\n');
});