this.getComponents().entrySet().stream()
    .allMatch(entry -> equalIgnoringDescriptor(entry.getValue(), that.getComponent(entry.getKey())));