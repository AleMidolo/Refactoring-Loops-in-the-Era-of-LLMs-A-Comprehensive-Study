a.stream()
    .peek(v -> _totalValueCount++)
    .peek(v -> _hasError |= ExpressionUtils.isError(v))
    .peek(v -> {
        if (ExpressionUtils.isNonBlankData(v)) {
            if (v instanceof OffsetDateTime) {
                _hasTime = true;
                processValue(((OffsetDateTime) v).toInstant().toEpochMilli(), allValues);
            } else {
                _hasNonTime = true;
            }
        } else {
            _hasBlank = true;
        }
    })
    .count();