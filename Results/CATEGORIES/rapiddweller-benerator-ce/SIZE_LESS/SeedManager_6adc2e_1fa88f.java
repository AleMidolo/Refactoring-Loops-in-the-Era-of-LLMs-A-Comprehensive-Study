for (Map.Entry<E, SeedManager<E>> entry : successors.entrySet()) {
    SeedManager<E> successor = entry.getValue();
    logger.debug("{}{}[{}]", indent, entry.getKey(), successor.getWeight());
    successor.printState("  " + indent);
}