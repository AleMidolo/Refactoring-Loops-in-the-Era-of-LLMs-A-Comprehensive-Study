for (Value value : qualifiersMap.get(constraint.allowedQualifierPid)) {
    if (!constraint.itemList.contains(value)) {
        QAWarning issue = new QAWarning(type, pid.getId() + constraint.allowedQualifierPid.getId(), QAWarning.Severity.WARNING, 1);
        issue.setProperty("statement_entity", pid);
        issue.setProperty("qualifier_entity", constraint.allowedQualifierPid);
        issue.setProperty("example_entity", update.getEntityId());
        addIssue(issue);
    }
}