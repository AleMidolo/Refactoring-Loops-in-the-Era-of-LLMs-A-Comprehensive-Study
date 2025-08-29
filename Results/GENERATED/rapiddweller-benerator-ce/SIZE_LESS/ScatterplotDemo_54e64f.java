IntStream.range(0, n)
    .forEach(i -> {
        int x = xGen.generate();
        int y = yGen.generate();
        g.drawLine(x, y, x, y);
    });