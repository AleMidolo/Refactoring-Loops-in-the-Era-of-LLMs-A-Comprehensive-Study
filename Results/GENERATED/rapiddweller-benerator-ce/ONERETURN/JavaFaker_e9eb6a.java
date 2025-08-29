return Arrays.stream(methods)
        .filter(m -> m.getParameterTypes().length == 0)
        .findFirst()
        .orElse(null);