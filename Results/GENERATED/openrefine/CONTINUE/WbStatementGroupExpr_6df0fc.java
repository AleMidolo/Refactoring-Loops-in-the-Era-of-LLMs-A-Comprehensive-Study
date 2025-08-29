statementExprs.stream()
    .map(expr -> {
        try {
            return expr.evaluate(ctxt, subject, propertyId);
        } catch (SkipSchemaExpressionException e) {
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(statements::add);