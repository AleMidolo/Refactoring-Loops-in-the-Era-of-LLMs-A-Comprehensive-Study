return IntStream.range(0, _pastEntries.size())
    .filter(i -> _pastEntries.get(i).id == entryID)
    .mapToObj(i -> i == 0 ? 0 : _pastEntries.get(i - 1).id)
    .findFirst()
    .orElseThrow(NoSuchElementException::new);