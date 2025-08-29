return annotations.stream()
        .filter(a -> annotationType.isAssignableFrom(a.getClass()))
        .map(a -> (T) a)
        .findFirst()
        .orElse(null);