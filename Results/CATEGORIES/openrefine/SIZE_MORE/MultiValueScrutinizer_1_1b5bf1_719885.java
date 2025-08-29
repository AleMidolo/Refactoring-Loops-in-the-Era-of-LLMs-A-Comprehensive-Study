for (PropertyIdValue pid : propertyCount.keySet()) {
    if (propertyCount.get(pid) == 1) {
        QAWarning issue = new QAWarning(new_type, pid.getId(), QAWarning.Severity.WARNING, 1);
        issue.setProperty("property_entity", pid);
        issue.setProperty("example_entity", update.getEntityId());
        addIssue(issue);
    }
}