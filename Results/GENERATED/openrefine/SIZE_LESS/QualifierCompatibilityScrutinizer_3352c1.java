missingQualifiers.stream()
    .map(missing -> new QAWarning(missingMandatoryQualifiersType, statementProperty.getId() + "-" + missing.getId(), QAWarning.Severity.WARNING, 1))
    .peek(issue -> {
        issue.setProperty("statement_property_entity", statementProperty);
        issue.setProperty("missing_property_entity", missing);
        issue.setProperty("example_item_entity", entityId);
    })
    .forEach(this::addIssue);