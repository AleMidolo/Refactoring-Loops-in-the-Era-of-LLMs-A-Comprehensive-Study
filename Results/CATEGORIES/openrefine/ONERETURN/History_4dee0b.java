for (int i = 0; i < _pastEntries.size(); i++) {
    if (_pastEntries.get(i).id == lastDoneEntryID) {
        undo(_pastEntries.size() - i - 1);
        return;
    }
}