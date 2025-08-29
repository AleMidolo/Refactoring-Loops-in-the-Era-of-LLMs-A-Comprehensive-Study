_newRows.stream()
    .forEach(row -> {
        row.save(writer, options);
        writer.write('\n');
    });