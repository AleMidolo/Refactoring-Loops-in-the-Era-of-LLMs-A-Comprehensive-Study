_oldCells.stream()
    .forEach(c -> {
        c.save(writer, options);
        writer.write('\n');
    });