for (Snak addedSnak : addedSnaks) {
    boolean matchingSnakFound = mergedSnaks.stream().anyMatch(existingSnak -> match(existingSnak, addedSnak));
    if (!matchingSnakFound) {
        mergedSnaks.add(addedSnak);
    }
}