IntStream.range(0, uris.length)
    .mapToObj(i -> factory.create(uris[i], context))
    .map(DataSourceGenerator::new)
    .toArray(DataSourceGenerator[]::new);