source.getComponents().entrySet().stream()
    .forEach(entry -> mapComponent(entry.getKey(), entry.getValue(), target));