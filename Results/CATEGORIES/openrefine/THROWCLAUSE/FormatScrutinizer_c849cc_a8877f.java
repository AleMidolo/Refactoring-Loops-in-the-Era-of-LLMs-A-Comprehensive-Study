for (Statement statement : statementList) {
    FormatConstraint constraint = new FormatConstraint(statement);
    String regex = constraint.regularExpressionFormat;
    Pattern pattern = null;
    if (regex != null) {
        try {
            pattern = Pattern.compile(regex);
            patterns.add(pattern);
        } catch (PatternSyntaxException e) {
            logger.info(String.format("Ignoring invalid format constraint for property %s. Regex %s is invalid: %s", pid.getId(), regex, e.getMessage()));
        }
    }
}