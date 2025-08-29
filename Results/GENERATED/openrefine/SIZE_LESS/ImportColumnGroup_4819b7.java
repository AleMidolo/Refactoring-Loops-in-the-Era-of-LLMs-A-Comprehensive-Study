columns.values().stream()
    .forEach(c -> {
        c.tabulate();
        nonBlankCount = Math.max(nonBlankCount, c.nonBlankCount);
    });