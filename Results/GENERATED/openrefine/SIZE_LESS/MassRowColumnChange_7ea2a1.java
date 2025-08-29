_oldRows.forEach(row -> {
    row.save(writer, options);
    writer.write('\n');
});