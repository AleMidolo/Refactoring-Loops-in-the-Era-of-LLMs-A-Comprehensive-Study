return ExpressionUtils.toObjectCollection(value).stream()
    .map(Object::toString)
    .anyMatch(this::checkValue) != invert;