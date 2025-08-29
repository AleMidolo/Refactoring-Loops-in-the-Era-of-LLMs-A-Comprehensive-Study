String result = cellIndices.stream()
    .mapToObj(String::valueOf)
    .collect(Collectors.joining(","));