return IntStream.range(0, value.length())
    .noneMatch(i -> !allowedValues.contains(value.charAt(i)));