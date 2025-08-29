addedSnaks.stream()
    .filter(addedSnak -> mergedSnaks.stream().noneMatch(existingSnak -> match(existingSnak, addedSnak)))
    .forEach(mergedSnaks::add);