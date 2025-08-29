constraintDefinitions.stream()
    .map(ItemRequiresConstraint::new)
    .filter(constraint -> {
        PropertyIdValue itemRequiresPid = constraint.itemRequiresPid;
        List<Value> itemList = constraint.itemList;
        return !propertyIdValueValueMap.containsKey(itemRequiresPid) || raiseWarning(propertyIdValueValueMap, itemRequiresPid, itemList);
    })
    .forEach(constraint -> {
        PropertyIdValue itemRequiresPid = constraint.itemRequiresPid;
        QAWarning issue = new QAWarning(update.isNew() ? newItemRequirePropertyType : existingItemRequirePropertyType, propertyId.getId() + itemRequiresPid.getId(), update.isNew() ? QAWarning.Severity.WARNING : QAWarning.Severity.INFO, 1);
        issue.setProperty("property_entity", propertyId);
        issue.setProperty("added_property_entity", itemRequiresPid);
        issue.setProperty("example_entity", update.getEntityId());
        addIssue(issue);
    });