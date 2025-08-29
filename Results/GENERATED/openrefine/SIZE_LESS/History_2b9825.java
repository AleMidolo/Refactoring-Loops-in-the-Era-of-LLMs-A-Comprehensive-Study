_futureEntries.stream()
    .forEach(entry -> {
        entry.save(writer, options);
        writer.write('\n');
    });