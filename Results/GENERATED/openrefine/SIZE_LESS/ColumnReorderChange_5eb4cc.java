_newColumns.stream()
    .forEach(c -> {
        c.save(writer);
        writer.write('\n');
    });