for (TypeDescriptor descriptor : descs) {
    ComplexTypeDescriptor complexType = (ComplexTypeDescriptor) descriptor;
    final String name = complexType.getName();
    InstanceDescriptor iDesc = new InstanceDescriptor(name, database, complexType);
    if (setup.getDbSnapshot() != null) {
        iDesc.setCount(ExpressionUtil.constant(0L));
    } else {
        iDesc.setCount(ExpressionUtil.constant(database.countEntities(name)));
    }
    generateTable(iDesc, writer);
}