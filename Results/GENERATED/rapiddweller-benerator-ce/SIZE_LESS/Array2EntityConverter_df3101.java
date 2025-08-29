IntStream.range(0, featureNames.length)
         .forEach(i -> entityMutators[i] = createFeatureMutator(featureNames[i], descriptor, stringSource));