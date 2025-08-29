mergedSnaks.addAll(addedSnaks.stream()
    .filter(addedSnak -> mergedSnaks.stream().noneMatch(existingSnak -> match(existingSnak, addedSnak)))
    .collect(Collectors.toList()));