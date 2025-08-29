update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .map(Snak::getPropertyId)
    .forEach(pid -> {
        List<Statement> statementList = _fetcher.getConstraintsByType(pid, multiValueConstraintQid);
        if (propertyCount.containsKey(pid)) {
            propertyCount.put(pid, propertyCount.get(pid) + 1);
        } else if (!statementList.isEmpty()) {
            propertyCount.put(pid, 1);
        }
    });