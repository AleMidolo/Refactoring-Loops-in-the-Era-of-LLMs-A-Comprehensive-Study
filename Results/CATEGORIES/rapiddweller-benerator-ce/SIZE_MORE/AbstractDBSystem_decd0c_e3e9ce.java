for (DBForeignKeyConstraint constraint : table.getForeignKeyConstraints()) {
    String[] foreignKeyColumnNames = constraint.getForeignKeyColumnNames();
    if (foreignKeyColumnNames.length == 1) {
        String fkColumnName = foreignKeyColumnNames[0];
        DBTable targetTable = constraint.getRefereeTable();
        DBColumn fkColumn = constraint.getTable().getColumn(fkColumnName);
        DBDataType concreteType = fkColumn.getType();
        String abstractType = JdbcMetaTypeMapper.abstractType(concreteType, acceptUnknownColumnTypes);
        ReferenceDescriptor descriptor = new ReferenceDescriptor(fkColumnName, this, abstractType, targetTable.getName(), constraint.getRefereeColumnNames()[0]);
        descriptor.getLocalType(false).setSource(id);
        descriptor.setMinCount(new ConstantExpression<>(1L));
        descriptor.setMaxCount(new ConstantExpression<>(1L));
        boolean nullable = fkColumn.isNullable();
        descriptor.setNullable(nullable);
        complexType.setComponent(descriptor);
        if (logger.isDebugEnabled()) {
            logger.debug("Parsed reference {}.{}", table.getName(), descriptor);
        }
    } else {
    }
}