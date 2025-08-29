for (double d = 1; d <= 4; d += 0.5) {
    assertEquals(1. / 7, counts.get(d).doubleValue() / n, 0.05);
}