IntStream.range(0, value.length)
    .mapToObj(i -> new WeightedSample<>(value[i], weight[i]))
    .forEach(mergedList::add);