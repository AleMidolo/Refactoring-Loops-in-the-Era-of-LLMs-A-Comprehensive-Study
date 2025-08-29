for (Object v : ExpressionUtils.toObjectCollection(value)) {
    if (checkValue(v)) {
        return true;
    }
}