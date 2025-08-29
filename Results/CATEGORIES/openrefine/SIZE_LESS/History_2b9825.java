for (HistoryEntry entry : _futureEntries) {
    entry.save(writer, options);
    writer.write('\n');
}