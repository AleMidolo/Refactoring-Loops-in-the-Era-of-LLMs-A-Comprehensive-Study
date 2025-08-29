for (DBColumn column : table.getColumns()) {
    try {
        logger.debug("parsing column: {}", column);
        String columnName = column.getName();
        if (complexType.getComponent(columnName) != null) {
            continue;
        }
        String columnId = table.getName() + '.' + columnName;
        if (column.isVersionColumn()) {
            logger.debug("Leaving out version column {}", columnId);
            continue;
        }
        DBDataType columnType = column.getType();
        String type = JdbcMetaTypeMapper.abstractType(columnType, acceptUnknownColumnTypes);
        String defaultValue = column.getDefaultValue();
        SimpleTypeDescriptor typeDescriptor = new SimpleTypeDescriptor(columnId, this, type);
        if (defaultValue != null) {
            typeDescriptor.setDetailValue("constant", defaultValue);
        }
        if (column.getSize() != null) {
            Integer size = column.getSize();
            if (size < 2147483647) {
                typeDescriptor.setMaxLength(size);
            }
        }
        if (column.getFractionDigits() != null) {
            if ("timestamp".equals(type)) {
                typeDescriptor.setGranularity("1970-01-02");
            } else {
                typeDescriptor.setGranularity(decimalGranularity(column.getFractionDigits()));
            }
        }
        PartDescriptor descriptor = new PartDescriptor(columnName, this);
        descriptor.setLocalType(typeDescriptor);
        descriptor.setMinCount(new ConstantExpression<>(1L));
        descriptor.setMaxCount(new ConstantExpression<>(1L));
        descriptor.setNullable(column.getNotNullConstraint() == null);
        List<DBUniqueConstraint> ukConstraints = column.getUkConstraints();
        for (DBUniqueConstraint constraint : ukConstraints) {
            if (constraint.getColumnNames().length == 1) {
                descriptor.setUnique(true);
            } else {
                logger.debug("Automated uniqueness assurance on multiple columns is not provided yet: {}", constraint);
            }
        }
        logger.debug("parsed attribute {}: {}", columnId, descriptor);
        complexType.setComponent(descriptor);
    } catch (Exception e) {
        throw BeneratorExceptionFactory.getInstance().configurationError("Error processing column " + column.getName() + " of table " + table.getName(), e);
    }
}