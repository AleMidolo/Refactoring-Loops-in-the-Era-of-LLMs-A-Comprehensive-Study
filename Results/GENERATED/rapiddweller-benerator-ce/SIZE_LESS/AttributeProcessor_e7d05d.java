list = list.stream()
    .map(this::applyToValue)
    .collect(Collectors.toList());