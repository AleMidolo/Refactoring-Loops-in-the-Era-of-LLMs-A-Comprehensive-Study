for (int i = Math.max(0, preSize - getDepth() + 1); i < preSize; i++) {
    generator = generator.getSuccessor(predecessors.get(i));
}