for (int i = 0; i < 100; i++) {
    Date generatedDate = GeneratorUtil.generateNonNull(generator);
    assertTrue("generated date not in expected value set: " + sdf.format(generatedDate), expectedDates.contains(generatedDate));
}