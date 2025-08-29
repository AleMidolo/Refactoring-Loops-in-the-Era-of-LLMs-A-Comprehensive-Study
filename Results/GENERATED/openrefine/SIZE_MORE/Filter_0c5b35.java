collection.stream()
        .filter(Objects::nonNull)
        .forEach(v -> {
            if (bindings.containsKey(name)) {
                bindings.put(name, v);
            } else {
                bindings.remove(name);
            }
            Object r = args[2].evaluate(bindings);
            if (r instanceof Boolean && (Boolean) r) {
                results.add(v);
            }
        });