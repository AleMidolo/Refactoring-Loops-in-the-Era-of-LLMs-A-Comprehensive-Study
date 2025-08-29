for (int i = 0; i < 10; i++) {
    assertEqualArrays(PersonAttrArrayGenerator.ALICE, GeneratorUtil.generateNonNull(generator));
}