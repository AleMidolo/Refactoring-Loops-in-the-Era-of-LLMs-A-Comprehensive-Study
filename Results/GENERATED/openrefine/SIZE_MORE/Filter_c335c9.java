IntStream.range(0, l)
    .mapToObj(i -> JsonValueConverter.convert(a.get(i)))
    .filter(Objects::nonNull)
    .peek(v -> {
        if (bindings.containsKey(name)) {
            bindings.put(name, v);
        } else {
            bindings.remove(name);
        }
    })
    .map(v -> args[2].evaluate(bindings))
    .filter(r -> r instanceof Boolean && (Boolean) r)
    .forEach(results::add);