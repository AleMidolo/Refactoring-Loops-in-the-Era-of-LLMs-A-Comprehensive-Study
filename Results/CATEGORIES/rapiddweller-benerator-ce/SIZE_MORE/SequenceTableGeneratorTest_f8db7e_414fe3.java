for (int i = 0; i < 100; ) {
    context.set("num", i);
    assertEquals(1000 + i / 2, generator.generate().intValue());
    i++;
    context.set("num", i);
    assertEquals(2000 + i / 2, generator.generate().intValue());
    i++;
}