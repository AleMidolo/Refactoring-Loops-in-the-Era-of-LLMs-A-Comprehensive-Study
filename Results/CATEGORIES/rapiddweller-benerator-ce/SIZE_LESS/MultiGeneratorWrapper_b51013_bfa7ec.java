for (Generator<? extends S> source : sources) {
    if (source != null) {
        source.init(context);
    }
}