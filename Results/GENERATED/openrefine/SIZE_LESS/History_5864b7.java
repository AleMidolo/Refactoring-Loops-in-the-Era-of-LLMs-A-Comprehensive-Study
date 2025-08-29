_pastEntries.forEach(entry -> {
    entry.save(writer, options);
    writer.write('\n');
});