return annotations.stream()
    .filter(a -> annotationType.isAssignableFrom(a.getClass()))
    .findFirst()
    .map(a -> (T) a)
    .orElse(null);