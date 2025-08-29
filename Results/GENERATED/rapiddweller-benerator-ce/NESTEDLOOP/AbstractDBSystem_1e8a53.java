table.getColumns().stream()
    .filter(column -> complexType.getComponent(column.getName()) == null && !column.isVersionColumn())
    .forEach(column -> {
        String columnId = table.getName() + '.' + column.getName();
        DBDataType columnType = column.getType();
        String type = JdbcMetaTypeMapper.abstractType(columnType, acceptUnknownColumnTypes);
        String defaultValue = column.getDefaultValue();
        SimpleTypeDescriptor typeDescriptor = new SimpleTypeDescriptor(columnId, this, type);
        if (defaultValue != null) {
            typeDescriptor.setDetailValue("constant", defaultValue);
        }
        if (column.getSize() != null && column.getSize() < 2147483647) {
            typeDescriptor.setMaxLength(column.getSize());
        }
        if (column.getFractionDigits() != null) {
            typeDescriptor.setGranularity("timestamp".equals(type) ? "1970-01-02" : decimalGranularity(column.getFractionDigits()));
        }
        PartDescriptor descriptor = new PartDescriptor(column.getName(), this);
        descriptor.setLocalType(typeDescriptor);
        descriptor.setMinCount(new ConstantExpression<>(1L));
        descriptor.setMaxCount(new ConstantExpression<>(1L));
        descriptor.setNullable(column.getNotNullConstraint() == null);
        column.getUkConstraints().stream().filter(constraint -> constraint.getColumnNames().length == 1)
            .forEach(constraint -> descriptor.setUnique(true));
        complexType.setComponent(descriptor);
    });