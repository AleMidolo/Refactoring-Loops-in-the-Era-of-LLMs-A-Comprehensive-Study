statementList.stream()
    .map(FormatConstraint::new)
    .map(constraint -> constraint.regularExpressionFormat)
    .filter(Objects::nonNull)
    .map(regex -> {
        try {
            return Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            logger.info(String.format("Ignoring invalid format constraint for property %s. Regex %s is invalid: %s", pid.getId(), regex, e.getMessage()));
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(patterns::add);