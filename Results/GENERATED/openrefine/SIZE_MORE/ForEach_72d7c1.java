values.stream()
        .filter(Objects::nonNull)
        .forEach(v -> {
            bindings.put(name, v);
            Object r = args[2].evaluate(bindings);
            results.add(r);
        });