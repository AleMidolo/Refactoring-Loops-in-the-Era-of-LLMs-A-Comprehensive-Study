successors.entrySet().forEach(entry -> {
    SeedManager<E> successor = entry.getValue();
    logger.debug("{}{}[{}]", indent, entry.getKey(), successor.getWeight());
    successor.printState("  " + indent);
});