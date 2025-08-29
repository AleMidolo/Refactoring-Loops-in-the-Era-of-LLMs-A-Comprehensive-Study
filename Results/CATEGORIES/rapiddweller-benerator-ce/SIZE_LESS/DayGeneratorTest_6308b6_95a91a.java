for (int i = 0; i < 5; i++) {
    Date generatedDate = generator.generate();
    assertNotNull("Generator unavailable after " + i + " generations", generatedDate);
    Date expectedDate = TimeUtil.addDays(minDate, i);
    assertEquals(expectedDate, generatedDate);
}