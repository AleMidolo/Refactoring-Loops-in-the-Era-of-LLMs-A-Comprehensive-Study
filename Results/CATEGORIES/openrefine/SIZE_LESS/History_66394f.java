for (int i = 0; i < _pastEntries.size(); i++) {
    if (_pastEntries.get(i).id == entryID) {
        return i == 0 ? 0 : _pastEntries.get(i - 1).id;
    }
}