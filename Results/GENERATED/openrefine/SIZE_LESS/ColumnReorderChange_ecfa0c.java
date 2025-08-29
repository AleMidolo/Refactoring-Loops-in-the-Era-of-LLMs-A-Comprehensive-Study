_oldColumns.forEach(c -> {
    c.save(writer);
    writer.write('\n');
});