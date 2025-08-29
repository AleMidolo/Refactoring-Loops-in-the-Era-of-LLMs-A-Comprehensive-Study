IntStream.range(0, arrayType.getElementCount())
         .mapToObj(i -> getElementOfTypeOrParents(arrayType, i))
         .filter(element -> element.getMode() != Mode.ignored)
         .map(element -> InstanceGeneratorFactory.createSingleInstanceGenerator(element, uniqueness, context))
         .forEach(generator -> result[i] = generator);