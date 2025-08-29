propertyIdValueValueMap.keySet().stream()
    .flatMap(propertyId -> _fetcher.getConstraintsByType(propertyId, conflictsWithConstraintQid).stream())
    .map(Statement::new)
    .forEach(statement -> {
        ConflictsWithConstraint constraint = new ConflictsWithConstraint(statement);
        PropertyIdValue conflictingPid = constraint.conflictingPid;
        List<Value> itemList = constraint.itemList;
        if (propertyIdValueValueMap.containsKey(conflictingPid) && raiseWarning(propertyIdValueValueMap, conflictingPid, itemList)) {
            QAWarning issue = new QAWarning(type, propertyId.getId() + conflictingPid.getId(), QAWarning.Severity.WARNING, 1);
            issue.setProperty("property_entity", propertyId);
            issue.setProperty("added_property_entity", conflictingPid);
            issue.setProperty("example_entity", update.getEntityId());
            issue.setFacetable(false);
            addIssue(issue);
        }
    });