subgroups.values().stream()
    .forEach(g -> {
        g.tabulate();
        nonBlankCount = Math.max(nonBlankCount, g.nonBlankCount);
    });