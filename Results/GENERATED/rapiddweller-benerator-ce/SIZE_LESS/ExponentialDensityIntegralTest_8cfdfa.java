counts.entrySet().stream()
    .map(entry -> entry.getKey())
    .filter(d -> d <= 2)
    .forEach(d -> {
        int count = counts.get(d).intValue();
        assertTrue(count < lastCount);
        lastCount = count;
    });