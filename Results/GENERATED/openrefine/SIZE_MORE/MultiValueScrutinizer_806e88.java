propertyCount.keySet().stream()
    .filter(pid -> propertyCount.get(pid) == 1)
    .forEach(pid -> {
        QAWarning issue = new QAWarning(existing_type, pid.getId(), QAWarning.Severity.INFO, 1);
        issue.setProperty("property_entity", pid);
        issue.setProperty("example_entity", update.getEntityId());
        addIssue(issue);
    });