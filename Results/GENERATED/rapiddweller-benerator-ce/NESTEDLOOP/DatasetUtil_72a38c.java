properties.entrySet().stream()
    .map(entry -> {
        String name = entry.getKey();
        Dataset dataset = getDataset(nesting, name, sets);
        String[] subsetNames = StringUtil.tokenize(entry.getValue(), ',');
        return Arrays.stream(subsetNames)
            .map(subsetName -> getDataset(nesting, subsetName, sets))
            .peek(dataset::addSubSet)
            .collect(Collectors.toList());
    }).collect(Collectors.toList());