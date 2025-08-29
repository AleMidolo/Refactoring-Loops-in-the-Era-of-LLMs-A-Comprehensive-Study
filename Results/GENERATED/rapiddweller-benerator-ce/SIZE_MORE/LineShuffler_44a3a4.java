IntStream.range(0, iterations)
    .forEach(i -> {
        int i1 = random.randomInt(size);
        int i2;
        do {
            i2 = random.randomInt(size);
        } while (i1 == i2);
        String tmp = lines.get(i1);
        lines.set(i1, lines.get(i2));
        lines.set(i2, tmp);
    });