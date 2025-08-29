IntStream.range(0, n)
    .forEach(i -> {
        SimpleTypeDescriptor alternative = descriptor.getAlternatives().get(i);
        sources[i] = createGenerator(alternative, null, false, Uniqueness.NONE, context);
    });