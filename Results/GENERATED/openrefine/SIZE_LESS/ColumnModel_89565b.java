columns.stream()
    .forEach(column -> {
        column.save(writer);
        writer.write('\n');
    });