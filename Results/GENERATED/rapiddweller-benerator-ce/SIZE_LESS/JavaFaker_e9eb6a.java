return methods.stream()
    .filter(m -> m.getParameterTypes().length == 0)
    .findFirst()
    .orElse(null);