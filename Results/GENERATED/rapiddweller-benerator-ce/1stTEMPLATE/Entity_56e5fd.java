return IntStream.range(0, Array.getLength(o1))
    .noneMatch(i -> !equalIgnoringDescriptor(Array.get(o1, i), Array.get(o2, i)));