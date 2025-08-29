IntStream.range(0, count)
    .forEach(i -> {
        _keyMakers[i] = _criteria[i].createKeyMaker();
        _comparatorWrappers[i] = new ComparatorWrapper(i);
    });