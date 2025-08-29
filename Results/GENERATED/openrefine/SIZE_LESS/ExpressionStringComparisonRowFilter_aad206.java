return ExpressionUtils.toObjectCollection(value).stream()
    .anyMatch(v -> checkValue(v.toString()) && !invert);