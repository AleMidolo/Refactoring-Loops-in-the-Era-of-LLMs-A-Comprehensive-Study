disallowedQualifiers.stream()
    .map(disallowed -> new QAWarning(disallowedQualifiersType, statementProperty.getId() + "-" + disallowed.getId(), QAWarning.Severity.WARNING, 1))
    .peek(issue -> {
        issue.setProperty("statement_property_entity", statementProperty);
        issue.setProperty("disallowed_property_entity", disallowed);
        issue.setProperty("example_item_entity", entityId);
    })
    .forEach(this::addIssue);