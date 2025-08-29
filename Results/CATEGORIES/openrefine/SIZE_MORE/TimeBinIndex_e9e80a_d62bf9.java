for (Object v : a) {
    _totalValueCount++;
    if (ExpressionUtils.isError(v)) {
        _hasError = true;
    } else if (ExpressionUtils.isNonBlankData(v)) {
        if (v instanceof OffsetDateTime) {
            _hasTime = true;
            processValue(((OffsetDateTime) v).toInstant().toEpochMilli(), allValues);
        } else {
            _hasNonTime = true;
        }
    } else {
        _hasBlank = true;
    }
}