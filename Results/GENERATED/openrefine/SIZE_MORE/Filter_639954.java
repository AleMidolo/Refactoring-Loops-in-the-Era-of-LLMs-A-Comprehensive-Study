collection.stream()
        .filter(Objects::nonNull)
        .forEach(v -> {
            if (bindings.get(name) != null) {
                bindings.put(name, v);
            } else {
                bindings.remove(name);
            }
            Object r = args[2].evaluate(bindings);
            if (r instanceof Boolean && ((Boolean) r)) {
                results.add(v);
            }
        });