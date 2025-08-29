for (Object v : ExpressionUtils.toObjectCollection(value)) {
    if (testValue(v)) {
        return false;
    }
}