_dimensions.stream()
    .map(dimension -> dimension.name)
    .collect(Collectors.toCollection(() -> columnNames));