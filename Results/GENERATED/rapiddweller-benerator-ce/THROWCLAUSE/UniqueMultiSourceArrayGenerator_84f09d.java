IntStream.range(0, buffer.length)
    .forEach(i -> {
        Generator<? extends S> source = sources.get(i);
        if (source != null) {
            ProductWrapper<?> wrapper = source.generate((ProductWrapper) getSourceWrapper());
            if (wrapper == null) {
                throw new InvalidGeneratorSetupException("Sub generator not available: " + source);
            }
            buffer[i] = wrapper.unwrap();
        }
    });