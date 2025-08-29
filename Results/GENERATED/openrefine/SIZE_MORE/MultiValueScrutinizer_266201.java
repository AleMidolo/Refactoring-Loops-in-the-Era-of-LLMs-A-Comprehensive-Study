propertyCount.keySet().stream()
    .filter(pid -> propertyCount.get(pid) == 1)
    .map(pid -> new QAWarning(new_type, pid.getId(), QAWarning.Severity.WARNING, 1))
    .peek(issue -> {
        issue.setProperty("property_entity", pid);
        issue.setProperty("example_entity", update.getEntityId());
    })
    .forEach(this::addIssue);