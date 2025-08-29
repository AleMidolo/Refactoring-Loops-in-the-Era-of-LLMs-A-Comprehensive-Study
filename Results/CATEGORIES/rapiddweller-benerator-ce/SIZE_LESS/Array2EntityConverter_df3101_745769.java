for (int i = 0; i < featureNames.length; i++) {
    this.entityMutators[i] = createFeatureMutator(featureNames[i], descriptor, stringSource);
}