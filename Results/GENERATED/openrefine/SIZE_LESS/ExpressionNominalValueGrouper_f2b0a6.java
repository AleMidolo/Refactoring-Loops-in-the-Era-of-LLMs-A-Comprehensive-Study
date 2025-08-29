ExpressionUtils.toObjectCollection(value).stream()
    .forEach(v -> processValue(v, rowIndex));