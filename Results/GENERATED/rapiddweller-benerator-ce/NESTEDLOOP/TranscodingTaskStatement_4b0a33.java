children.stream()
    .map(statement -> statement.getType(getSourceEx().evaluate(context), context).getName())
    .forEach(tableName -> tableNkRequirements.put(tableName, false));
children.stream()
    .flatMap(statement -> statement.getType(getSourceEx().evaluate(context), context).getReferenceComponents().stream())
    .forEach(ref -> {
        String targetTable = ref.getTargetType();
        if (!tableNkRequirements.containsKey(targetTable) && statement.getSource(context).countEntities(targetTable) > 0) {
            tableNkRequirements.put(targetTable, true);
            identitiesRequired = true;
        }
    });
identitiesRequired |= children.stream()
    .map(statement -> collectPreconditions(statement.getSubStatements(), context))
    .reduce(false, (a, b) -> a | b);