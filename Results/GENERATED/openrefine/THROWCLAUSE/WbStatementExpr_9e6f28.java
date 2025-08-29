getQualifiers().stream()
    .map(qExpr -> {
        try {
            return qExpr.evaluate(ctxt);
        } catch (SkipSchemaExpressionException e) {
            QAWarning warning = new QAWarning("ignored-qualifiers", null, QAWarning.Severity.INFO, 1);
            warning.setProperty("example_entity", subject);
            warning.setProperty("example_property_entity", mainSnak.getPropertyId());
            ctxt.addWarning(warning);
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(qualifiers::add);