root.entrySet().stream()
    .forEach(entry -> context.set(entry.getKey(), entry.getValue()));