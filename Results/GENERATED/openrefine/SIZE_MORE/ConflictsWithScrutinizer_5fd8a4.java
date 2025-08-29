statementList.stream()
    .map(Statement::new)
    .filter(constraint -> propertyIdValueValueMap.containsKey(constraint.conflictingPid) && raiseWarning(propertyIdValueValueMap, constraint.conflictingPid, constraint.itemList))
    .forEach(constraint -> {
        QAWarning issue = new QAWarning(type, propertyId.getId() + constraint.conflictingPid.getId(), QAWarning.Severity.WARNING, 1);
        issue.setProperty("property_entity", propertyId);
        issue.setProperty("added_property_entity", constraint.conflictingPid);
        issue.setProperty("example_entity", update.getEntityId());
        issue.setFacetable(false);
        addIssue(issue);
    });