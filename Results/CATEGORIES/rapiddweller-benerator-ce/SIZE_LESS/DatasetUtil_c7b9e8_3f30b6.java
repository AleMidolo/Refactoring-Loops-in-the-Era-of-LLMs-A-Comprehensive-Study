for (String subsetName : subsetNames) {
    Dataset subset = getDataset(nesting, subsetName, sets);
    dataset.addSubSet(subset);
}