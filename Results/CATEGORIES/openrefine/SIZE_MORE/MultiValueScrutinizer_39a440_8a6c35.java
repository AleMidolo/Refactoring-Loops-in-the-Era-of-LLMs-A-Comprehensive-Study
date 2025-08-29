for (Statement statement : update.getAddedStatements()) {
    PropertyIdValue pid = statement.getClaim().getMainSnak().getPropertyId();
    List<Statement> statementList = _fetcher.getConstraintsByType(pid, multiValueConstraintQid);
    if (propertyCount.containsKey(pid)) {
        propertyCount.put(pid, propertyCount.get(pid) + 1);
    } else if (!statementList.isEmpty()) {
        propertyCount.put(pid, 1);
    }
}