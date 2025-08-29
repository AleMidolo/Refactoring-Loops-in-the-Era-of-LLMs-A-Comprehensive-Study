for (CascadeParent statement : children) {
    ComplexTypeDescriptor type = statement.getType(getSourceEx().evaluate(context), context);
    String tableName = type.getName();
    tableNkRequirements.put(tableName, false);
    for (ReferenceDescriptor ref : type.getReferenceComponents()) {
        String targetTable = ref.getTargetType();
        if (!tableNkRequirements.containsKey(targetTable) && statement.getSource(context).countEntities(targetTable) > 0) {
            tableNkRequirements.put(targetTable, true);
            identitiesRequired = true;
        }
    }
    identitiesRequired |= collectPreconditions(statement.getSubStatements(), context);
}