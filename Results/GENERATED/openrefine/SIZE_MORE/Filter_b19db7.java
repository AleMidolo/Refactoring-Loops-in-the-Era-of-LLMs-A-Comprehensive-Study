values.stream()
    .filter(Objects::nonNull)
    .forEach(v -> {
        bindings.put(name, v);
        bindings.remove(name);
        Object r = args[2].evaluate(bindings);
        if (r instanceof Boolean && ((Boolean) r).booleanValue()) {
            results.add(v);
        }
    });