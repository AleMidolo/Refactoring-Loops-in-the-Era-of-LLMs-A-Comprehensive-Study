for (Map.Entry<String, Object> entry : entity.getComponents().entrySet()) {
    AnyMutator.setValue(record, entry.getKey(), entry.getValue());
}