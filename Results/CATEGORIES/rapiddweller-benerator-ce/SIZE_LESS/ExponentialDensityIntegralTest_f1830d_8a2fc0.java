for (double d = 1; d <= 2; d += 0.5) {
    int count = counts.get(d).intValue();
    assertTrue(count < lastCount);
    lastCount = count;
}