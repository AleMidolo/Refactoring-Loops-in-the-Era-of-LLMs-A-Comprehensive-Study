for (Generator<? extends S> source : sources) {
    if (!source.isParallelizable()) {
        return false;
    }
}