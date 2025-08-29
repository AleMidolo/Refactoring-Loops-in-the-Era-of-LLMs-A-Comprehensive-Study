return Arrays.stream(args)
    .filter(Objects::nonNull)
    .findFirst()
    .orElse(null);