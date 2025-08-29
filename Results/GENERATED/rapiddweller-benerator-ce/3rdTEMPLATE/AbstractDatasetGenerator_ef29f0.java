dataset.getSubSets().stream()
    .map(subSet -> createDatasetGenerator(subSet, false, fallback))
    .filter(Objects::nonNull)
    .forEach(subGenerator -> generator.addSubDataset(subGenerator, subGenerator.getWeight()));