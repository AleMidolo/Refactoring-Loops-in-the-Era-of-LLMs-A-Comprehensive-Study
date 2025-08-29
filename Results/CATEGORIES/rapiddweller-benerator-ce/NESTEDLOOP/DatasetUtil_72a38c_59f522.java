for (Map.Entry<String, String> entry : properties.entrySet()) {
    String name = entry.getKey();
    Dataset dataset = getDataset(nesting, name, sets);
    String[] subsetNames = StringUtil.tokenize(entry.getValue(), ',');
    for (String subsetName : subsetNames) {
        Dataset subset = getDataset(nesting, subsetName, sets);
        dataset.addSubSet(subset);
    }
}