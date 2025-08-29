for (ImportColumnGroup g : subgroups.values()) {
    g.tabulate();
    nonBlankCount = Math.max(nonBlankCount, g.nonBlankCount);
}