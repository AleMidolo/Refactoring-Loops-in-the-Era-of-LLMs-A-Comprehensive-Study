for (Generator<? extends E> generator : getSource().getSources()) {
    DatasetBasedGenerator<E> dbGenerator = (DatasetBasedGenerator<E>) generator;
    if (dbGenerator.getDataset().equals(requestedDataset)) {
        return dbGenerator;
    }
    if (generator instanceof CompositeDatasetGenerator) {
        DatasetBasedGenerator<E> tmp = ((CompositeDatasetGenerator<E>) generator).getGeneratorForDataset(requestedDataset, false);
        if (tmp != null) {
            return tmp;
        }
    }
}