a.stream()
    .peek(v -> _totalValueCount++)
    .peek(v -> _hasError = _hasError || ExpressionUtils.isError(v))
    .filter(v -> !ExpressionUtils.isError(v))
    .filter(ExpressionUtils::isNonBlankData)
    .forEach(v -> {
        if (v instanceof OffsetDateTime) {
            _hasTime = true;
            processValue(((OffsetDateTime) v).toInstant().toEpochMilli(), allValues);
        } else {
            _hasNonTime = true;
        }
    });