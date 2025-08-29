IntStream.range(0, typeMappings.length / 2)
    .mapToObj(i -> new AbstractConcretePair(typeMappings[i * 2], typeMappings[i * 2 + 1]))
    .forEach(pair -> map((String) pair.getAbstractType(), (Class<?>) pair.getConcreteType()));