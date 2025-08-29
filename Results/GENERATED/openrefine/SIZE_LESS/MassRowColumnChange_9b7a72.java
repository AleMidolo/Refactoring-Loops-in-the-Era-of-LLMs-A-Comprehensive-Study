_oldColumns.forEach(column -> {
    column.save(writer);
    writer.write('\n');
});