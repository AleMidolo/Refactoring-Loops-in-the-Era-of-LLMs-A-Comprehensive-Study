update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .map(Snak::getPropertyId)
    .distinct()
    .forEach(pid -> {
        List<Statement> constraintDefinitions = _fetcher.getConstraintsByType(pid, citationNeededConstraintQid);
        update.getAddedStatements().stream()
            .filter(statement -> statement.getClaim().getMainSnak().getPropertyId().equals(pid))
            .flatMap(statement -> statement.getReferences().stream())
            .findAny()
            .ifPresentOrElse(
                referenceList -> {},
                () -> {
                    if (!constraintDefinitions.isEmpty()) {
                        QAWarning issue = new QAWarning(constraintItemType, pid.getId(), QAWarning.Severity.IMPORTANT, 1);
                        issue.setProperty("property_entity", pid);
                        issue.setProperty("example_entity", update.getEntityId());
                        addIssue(issue);
                    } else {
                        warning(generalType);
                    }
            });
});