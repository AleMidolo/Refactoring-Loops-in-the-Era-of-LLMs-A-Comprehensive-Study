ExpressionUtils.toObjectCollection(value).stream()
        .anyMatch(v -> testValue(v));