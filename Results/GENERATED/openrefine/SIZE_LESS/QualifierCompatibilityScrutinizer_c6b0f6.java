missingQualifiers.stream()
    .map(missing -> new QAWarning(missingMandatoryQualifiersType, statementProperty.getId() + "-" + missing.getId(), QAWarning.Severity.WARNING, 1)
            .setProperty("statement_property_entity", statementProperty)
            .setProperty("missing_property_entity", missing)
            .setProperty("example_item_entity", entityId))
    .forEach(this::addIssue);