IntStream.range(0, widths.size() - 1)
        .filter(i -> widths.get(i) == 1)
        .forEach(i -> {
            widths.set(i + 1, widths.get(i + 1) + 1);
            widths.remove(i);
        });