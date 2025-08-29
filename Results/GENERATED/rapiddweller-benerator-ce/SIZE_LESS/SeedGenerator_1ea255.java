IntStream.range(0, atoms.length - getDepth() + 1)
    .forEach(i -> atomProvider.addSequence(i, atoms));