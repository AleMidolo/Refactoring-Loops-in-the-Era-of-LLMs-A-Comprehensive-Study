for (int i = 0; i < 10; i++) {
    String message = generator.generate(wrapper).unwrap();
    StringTokenizer tokenizer = new StringTokenizer(message, " ");
    assertEquals(2, tokenizer.countTokens());
    assertTrue(salutations.contains(tokenizer.nextToken()));
    assertTrue(names.contains(tokenizer.nextToken()));
}