update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .map(Snak::getPropertyId)
    .distinct()
    .forEach(pid -> {
        Map<PropertyIdValue, List<Value>> qualifiersMap = new HashMap<>();
        List<SnakGroup> qualifiersList = update.getAddedStatements().stream()
            .map(Statement::getClaim)
            .map(Claim::getQualifiers)
            .flatMap(List::stream)
            .collect(Collectors.toList());
        qualifiersList.forEach(qualifier -> {
            PropertyIdValue qualifierPid = qualifier.getProperty();
            List<Value> itemList = qualifier.getSnaks().stream()
                .filter(s -> s instanceof ValueSnak)
                .map(s -> ((ValueSnak) s).getValue())
                .collect(Collectors.toList());
            if (qualifiersMap.containsKey(qualifierPid)) {
                qualifiersMap.get(qualifierPid).addAll(itemList);
            } else {
                qualifiersMap.put(qualifierPid, itemList);
            }
        });
        _fetcher.getConstraintsByType(pid, oneOfQualifierValuePropertyQid).stream()
            .map(UseAsQualifierConstraint::new)
            .forEach(constraint -> {
                if (qualifiersMap.containsKey(constraint.allowedQualifierPid)) {
                    qualifiersMap.get(constraint.allowedQualifierPid).forEach(value -> {
                        if (!constraint.itemList.contains(value)) {
                            QAWarning issue = new QAWarning(type, pid.getId() + constraint.allowedQualifierPid.getId(), QAWarning.Severity.WARNING, 1);
                            issue.setProperty("statement_entity", pid);
                            issue.setProperty("qualifier_entity", constraint.allowedQualifierPid);
                            issue.setProperty("example_entity", update.getEntityId());
                            addIssue(issue);
                        }
                    });
                }
            });
    });