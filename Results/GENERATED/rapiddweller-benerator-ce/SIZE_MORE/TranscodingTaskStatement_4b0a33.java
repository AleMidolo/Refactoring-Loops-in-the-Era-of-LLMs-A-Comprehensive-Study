children.stream()
    .forEach(statement -> {
        ComplexTypeDescriptor type = statement.getType(getSourceEx().evaluate(context), context);
        String tableName = type.getName();
        tableNkRequirements.put(tableName, false);
        type.getReferenceComponents()
            .stream()
            .forEach(ref -> {
                String targetTable = ref.getTargetType();
                if (!tableNkRequirements.containsKey(targetTable) && statement.getSource(context).countEntities(targetTable) > 0) {
                    tableNkRequirements.put(targetTable, true);
                    identitiesRequired = true;
                }
            });
        identitiesRequired |= collectPreconditions(statement.getSubStatements(), context);
    });