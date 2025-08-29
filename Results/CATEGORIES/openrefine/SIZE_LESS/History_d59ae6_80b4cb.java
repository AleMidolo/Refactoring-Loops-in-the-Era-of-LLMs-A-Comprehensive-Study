for (int i = 0; i < count; i++) {
    _pastEntries.add(HistoryEntry.load(project, reader.readLine()));
}