for (int i = 0; i < 10; i++) {
    Object[] array = generator.generate(wrapper).unwrap();
    assertEquals(2, array.length);
    assertTrue(salutations.contains(array[0]));
    assertTrue(names.contains(array[1]));
}