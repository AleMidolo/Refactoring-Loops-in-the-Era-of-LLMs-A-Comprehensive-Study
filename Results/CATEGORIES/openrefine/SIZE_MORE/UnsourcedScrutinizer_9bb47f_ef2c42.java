for (Statement statement : update.getAddedStatements()) {
    PropertyIdValue pid = statement.getClaim().getMainSnak().getPropertyId();
    List<Statement> constraintDefinitions = _fetcher.getConstraintsByType(pid, citationNeededConstraintQid);
    List<Reference> referenceList = statement.getReferences();
    if (referenceList.isEmpty()) {
        if (!constraintDefinitions.isEmpty()) {
            QAWarning issue = new QAWarning(constraintItemType, pid.getId(), QAWarning.Severity.IMPORTANT, 1);
            issue.setProperty("property_entity", pid);
            issue.setProperty("example_entity", update.getEntityId());
            addIssue(issue);
        } else {
            warning(generalType);
        }
    }
}