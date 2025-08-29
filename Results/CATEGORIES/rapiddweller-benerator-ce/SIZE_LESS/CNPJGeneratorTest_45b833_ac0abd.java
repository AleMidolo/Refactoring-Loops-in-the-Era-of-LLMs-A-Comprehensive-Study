for (int i = 0; i < 100; i++) {
    String cnpj = generator.generate();
    assertEquals(18, cnpj.length());
    assertTrue(validator.valid(cnpj));
}