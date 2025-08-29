for (Object v : ExpressionUtils.toObjectCollection(value)) {
    if (checkValue(v.toString())) {
        return !invert;
    }
}