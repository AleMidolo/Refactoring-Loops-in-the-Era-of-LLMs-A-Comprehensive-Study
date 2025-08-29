for (HistoryEntry entry : _pastEntries) {
    entry.save(writer, options);
    writer.write('\n');
}