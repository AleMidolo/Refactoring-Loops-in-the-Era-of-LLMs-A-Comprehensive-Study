for (ImportColumn c : columns.values()) {
    c.tabulate();
    nonBlankCount = Math.max(nonBlankCount, c.nonBlankCount);
}