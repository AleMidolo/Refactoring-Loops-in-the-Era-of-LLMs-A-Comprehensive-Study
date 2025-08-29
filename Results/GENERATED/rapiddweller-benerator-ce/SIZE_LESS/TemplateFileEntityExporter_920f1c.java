entity.getComponents().entrySet().stream()
    .forEach(entry -> AnyMutator.setValue(record, entry.getKey(), entry.getValue()));