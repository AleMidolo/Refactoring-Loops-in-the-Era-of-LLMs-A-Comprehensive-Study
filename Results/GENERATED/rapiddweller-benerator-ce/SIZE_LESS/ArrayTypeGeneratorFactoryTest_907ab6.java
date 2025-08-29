IntStream.range(0, 10)
    .forEach(i -> assertEqualArrays(PersonAttrArrayGenerator.ALICE, GeneratorUtil.generateNonNull(generator)));