for (int i = 0; i < _futureEntries.size(); i++) {
    if (_futureEntries.get(i).id == lastDoneEntryID) {
        redo(i + 1);
        return;
    }
}