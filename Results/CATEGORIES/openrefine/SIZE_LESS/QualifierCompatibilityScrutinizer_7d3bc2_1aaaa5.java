for (PropertyIdValue missing : missingQualifiers) {
    QAWarning issue = new QAWarning(missingMandatoryQualifiersType, statementProperty.getId() + "-" + missing.getId(), QAWarning.Severity.WARNING, 1);
    issue.setProperty("statement_property_entity", statementProperty);
    issue.setProperty("missing_property_entity", missing);
    issue.setProperty("example_item_entity", entityId);
    addIssue(issue);
}