other.getProperties().entrySet().stream()
    .forEach(entry -> merged.setProperty(entry.getKey(), entry.getValue()));