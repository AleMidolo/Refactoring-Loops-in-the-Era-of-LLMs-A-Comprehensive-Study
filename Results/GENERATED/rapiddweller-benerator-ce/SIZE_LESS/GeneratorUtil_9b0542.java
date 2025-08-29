IntStream.range(1, sources.length)
    .mapToObj(i -> sources[i].getGeneratedType())
    .filter(tmp -> tmp.isAssignableFrom(type))
    .forEach(tmp -> type = tmp);