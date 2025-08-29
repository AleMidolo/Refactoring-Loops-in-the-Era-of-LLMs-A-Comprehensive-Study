generator = IntStream.range(Math.max(0, preSize - getDepth() + 1), preSize)
    .mapToObj(i -> generator.getSuccessor(predecessors.get(i)))
    .reduce((a, b) -> b)
    .orElse(null);