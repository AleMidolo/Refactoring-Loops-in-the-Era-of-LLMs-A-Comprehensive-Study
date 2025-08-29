return IntStream.range(0, _futureEntries.size())
    .filter(i -> _futureEntries.get(i).id == entryID)
    .mapToObj(i -> i > 0 ? _futureEntries.get(i - 1).id
                        : _pastEntries.size() > 0 ? _pastEntries.get(_pastEntries.size() - 1).id
                                                  : 0)
    .findFirst()
    .orElse(-1);