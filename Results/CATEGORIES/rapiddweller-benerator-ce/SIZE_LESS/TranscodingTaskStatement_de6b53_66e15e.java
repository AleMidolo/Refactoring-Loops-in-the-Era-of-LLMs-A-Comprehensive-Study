for (ReferenceDescriptor ref : type.getReferenceComponents()) {
    String targetTable = ref.getTargetType();
    if (!tableNkRequirements.containsKey(targetTable) && statement.getSource(context).countEntities(targetTable) > 0) {
        tableNkRequirements.put(targetTable, true);
        identitiesRequired = true;
    }
}