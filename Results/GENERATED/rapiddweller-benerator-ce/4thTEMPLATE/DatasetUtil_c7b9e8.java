subsetNames.stream()
            .map(subsetName -> getDataset(nesting, subsetName, sets))
            .forEach(dataset::addSubSet);