_cellChanges.stream()
    .forEach(c -> c.save(writer, options));