for (int i = 0; i < N; i++) {
    String title = GeneratorUtil.generateNullable(generator);
    if (title.length() > 0) {
        assertTrue(expectedTitles.contains(title));
        nobCount++;
    }
}