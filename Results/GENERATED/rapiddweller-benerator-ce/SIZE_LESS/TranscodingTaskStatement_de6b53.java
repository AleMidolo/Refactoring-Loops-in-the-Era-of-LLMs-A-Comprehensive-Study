type.getReferenceComponents().stream()
        .map(ReferenceDescriptor::getTargetType)
        .filter(targetTable -> !tableNkRequirements.containsKey(targetTable) 
                && statement.getSource(context).countEntities(targetTable) > 0)
        .forEach(targetTable -> {
            tableNkRequirements.put(targetTable, true);
            identitiesRequired = true;
        });