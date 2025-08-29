widths.listIterator(widths.size() - 2)
    .forEachRemaining(i -> {
        if (widths.get(i) == 1) {
            widths.set(i + 1, widths.get(i + 1) + 1);
            widths.remove(i);
        }
    });