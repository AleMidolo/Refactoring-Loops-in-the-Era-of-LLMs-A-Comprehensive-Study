update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .map(Snak::getPropertyId)
    .forEach(pid -> {
        List<Statement> constraintStatementList1 = _fetcher.getConstraintsByType(pid, singleValueConstraintQid);
        List<Statement> constraintStatementList2 = _fetcher.getConstraintsByType(pid, singleBestValueConstraintQid);

        if (seenSingleProperties.contains(pid)) {
            QAWarning issue = new QAWarning(type, pid.getId(), QAWarning.Severity.WARNING, 1);
            issue.setProperty("property_entity", pid);
            issue.setProperty("example_entity", update.getEntityId());
            issue.setFacetable(false);
            addIssue(issue);
        } else if (!constraintStatementList1.isEmpty() || !constraintStatementList2.isEmpty()) {
            seenSingleProperties.add(pid);
        }
    });