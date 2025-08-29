for (int i = 0; i < 100; i++) {
    String cpf = generator.generate();
    assertEquals(14, cpf.length());
    assertTrue(validator.valid(cpf));
}