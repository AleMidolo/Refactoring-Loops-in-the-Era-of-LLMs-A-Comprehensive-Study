for (int i = 0; i < 10000; i++) {
    Date date = generator.generate();
    assertNotNull(date);
    assertFalse(date.before(min));
    assertFalse(date.after(max));
    long time = date.getTime();
    long time0 = min.getTime();
    assertEquals(0, (time - time0) % granularity);
}