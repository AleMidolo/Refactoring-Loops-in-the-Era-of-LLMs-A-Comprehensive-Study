for (int i = 0; i < 10; i++) {
    String sentence = generator.generate();
    assertNotNull(sentence);
}