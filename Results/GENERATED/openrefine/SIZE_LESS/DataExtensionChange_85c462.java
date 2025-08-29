_columnNames.stream()
    .forEach(name -> {
        writer.write(name);
        writer.write('\n');
    });