_newCells.stream()
    .forEach(c -> {
        c.save(writer, options);
        writer.write('\n');
    });