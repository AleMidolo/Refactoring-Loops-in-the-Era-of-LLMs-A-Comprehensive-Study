IntStream.range(0, l)
    .mapToObj(i -> JsonValueConverter.convert(a.get(i)))
    .filter(Objects::nonNull)
    .forEach(v -> {
        bindings.put(name, v);
        Object r = args[2].evaluate(bindings);
        results.add(r);
    });