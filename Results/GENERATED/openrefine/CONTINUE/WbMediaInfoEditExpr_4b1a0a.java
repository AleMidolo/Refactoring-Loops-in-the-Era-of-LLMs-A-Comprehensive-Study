getStatementGroups().stream()
    .map(expr -> {
        try {
            return expr.evaluate(ctxt, subjectId);
        } catch (SkipSchemaExpressionException e) {
            return null;
        }
    })
    .filter(Objects::nonNull)
    .flatMap(statementGroupUpdate -> statementGroupUpdate.getStatementEdits().stream())
    .forEach(update::addStatement);