for (WbReferenceExpr rExpr : getReferences()) {
    try {
        references.add(rExpr.evaluate(ctxt));
    } catch (SkipSchemaExpressionException e) {
        QAWarning warning = new QAWarning("ignored-references", null, QAWarning.Severity.INFO, 1);
        warning.setProperty("example_entity", subject);
        warning.setProperty("example_property_entity", mainSnak.getPropertyId());
        ctxt.addWarning(warning);
    }
}