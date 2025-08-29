for (Dataset subSet : dataset.getSubSets()) {
    WeightedDatasetGenerator<E> subGenerator = createDatasetGenerator(subSet, false, fallback);
    if (subGenerator != null) {
        generator.addSubDataset(subGenerator, subGenerator.getWeight());
    }
}