int lastSubGenIndex = IntStream.range(0, statements.size())
        .mapToObj(i -> statements.get(i)).collect(Collectors.toList()).indexOf(statement -> statement instanceof GenIterStatement);