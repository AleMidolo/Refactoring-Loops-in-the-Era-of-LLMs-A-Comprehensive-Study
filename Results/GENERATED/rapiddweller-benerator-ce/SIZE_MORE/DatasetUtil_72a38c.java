properties.entrySet().stream()
    .forEach(entry -> {
        String name = entry.getKey();
        Dataset dataset = getDataset(nesting, name, sets);
        String[] subsetNames = StringUtil.tokenize(entry.getValue(), ',');
        Arrays.stream(subsetNames)
            .map(subsetName -> getDataset(nesting, subsetName, sets))
            .forEach(dataset::addSubSet);
    });