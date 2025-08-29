constraintDefinitions.stream()
    .map(constraintStatement -> new UseAsQualifierConstraint(constraintStatement))
    .filter(constraint -> qualifiersMap.containsKey(constraint.allowedQualifierPid))
    .forEach(constraint -> {
        qualifiersMap.get(constraint.allowedQualifierPid).stream()
            .filter(value -> !constraint.itemList.contains(value))
            .forEach(value -> {
                QAWarning issue = new QAWarning(type, pid.getId() + constraint.allowedQualifierPid.getId(), QAWarning.Severity.WARNING, 1);
                issue.setProperty("statement_entity", pid);
                issue.setProperty("qualifier_entity", constraint.allowedQualifierPid);
                issue.setProperty("example_entity", update.getEntityId());
                addIssue(issue);
            });
    });