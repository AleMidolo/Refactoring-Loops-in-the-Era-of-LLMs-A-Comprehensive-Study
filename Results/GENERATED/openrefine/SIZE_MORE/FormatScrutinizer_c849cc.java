statementList.stream()
    .map(FormatConstraint::new)
    .filter(constraint -> constraint.regularExpressionFormat != null)
    .map(constraint -> {
        try {
            return Pattern.compile(constraint.regularExpressionFormat);
        } catch (PatternSyntaxException e) {
            logger.info(String.format("Ignoring invalid format constraint for property %s. Regex %s is invalid: %s", pid.getId(), constraint.regularExpressionFormat, e.getMessage()));
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(patterns::add);