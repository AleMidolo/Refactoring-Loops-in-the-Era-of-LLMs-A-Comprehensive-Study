ExpressionUtils.toObjectCollection(value).stream()
    .peek(v -> _totalValueCount++)
    .forEach(v -> {
        if (ExpressionUtils.isError(v)) {
            _hasError = true;
        } else if (ExpressionUtils.isNonBlankData(v)) {
            if (v instanceof Number) {
                if (processValue(((Number) v).doubleValue(), allValues)) {
                    _hasNumeric = true;
                } else {
                    _hasError = true;
                }
            } else {
                _hasNonNumeric = true;
            }
        } else {
            _hasBlank = true;
        }
    });