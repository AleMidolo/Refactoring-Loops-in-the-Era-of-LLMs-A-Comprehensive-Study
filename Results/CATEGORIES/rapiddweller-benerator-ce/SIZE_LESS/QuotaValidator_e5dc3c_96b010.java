for (Object product : collection) {
    if (filter.accept(product)) {
        matchCount++;
    }
}