entrypoints.stream()
    .forEach(entrypoint -> {
        jscompArgs.add("--entry_point");
        jscompArgs.add(entrypoint);
    });