for (int i = 0; i < count; i++) {
    _futureEntries.add(HistoryEntry.load(project, reader.readLine()));
}