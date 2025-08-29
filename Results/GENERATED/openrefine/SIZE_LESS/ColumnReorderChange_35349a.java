_columnNames.stream()
    .forEach(n -> {
        writer.write(n);
        writer.write('\n');
    });