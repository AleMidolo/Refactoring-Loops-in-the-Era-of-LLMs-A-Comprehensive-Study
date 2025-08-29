for (Generator<? extends S> source : sources) {
    if (!source.isThreadSafe()) {
        return false;
    }
}