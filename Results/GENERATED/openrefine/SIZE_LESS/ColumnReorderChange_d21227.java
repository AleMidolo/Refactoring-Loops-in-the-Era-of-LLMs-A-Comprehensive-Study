_removedColumns.stream()
    .forEach(c -> {
        c.save(writer);
        writer.write('\n');
    });