props.entrySet().stream()
    .map(entry -> new String[] { entry.getKey(), entry.getValue() })
    .forEach(builder::add);