int c = IntStream.range(0, _comparatorWrappers.length)
    .takeWhile(i -> c == 0)
    .map(i -> _comparatorWrappers[i].compare(project, o1, i1, o2, i2))
    .findFirst()
    .orElse(0);