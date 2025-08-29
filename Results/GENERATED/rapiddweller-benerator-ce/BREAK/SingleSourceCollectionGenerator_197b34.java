IntStream.iterate(0, i -> size == null || i < size, i -> i + 1)
    .mapToObj(i -> {
        ProductWrapper<I> component = generateFromSource();
        if (component == null) {
            getSource().reset();
            return null;
        }
        return component.unwrap();
    })
    .filter(Objects::nonNull)
    .forEach(collection::add);