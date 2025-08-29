return IntStream.range(0, _columnNames.size())
        .filter(i -> name.equals(_columnNames.get(i)))
        .findFirst()
        .orElse(-1);