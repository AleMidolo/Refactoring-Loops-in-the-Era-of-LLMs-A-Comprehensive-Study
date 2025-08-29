getSnaks().stream()
    .map(expr -> {
        try {
            return expr.evaluate(ctxt);
        } catch (SkipSchemaExpressionException e) {
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(snakList::add);