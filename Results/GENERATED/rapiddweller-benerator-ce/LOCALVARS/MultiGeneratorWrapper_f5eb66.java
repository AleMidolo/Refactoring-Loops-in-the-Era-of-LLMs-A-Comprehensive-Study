IntStream.range(0, sources.size())
    .mapToObj(i -> {
        elementWrapper = sources.get(i).generate(elementWrapper);
        return elementWrapper == null ? null : (S) elementWrapper.unwrap();
    })
    .collect(Collectors.toList())
    .toArray(result);