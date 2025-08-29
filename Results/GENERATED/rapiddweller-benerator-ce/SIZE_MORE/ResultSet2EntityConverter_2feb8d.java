IntStream.rangeClosed(1, columnCount)
    .forEach(columnIndex -> {
        String columnName = metaData.getColumnName(columnIndex);
        String typeName = (descriptor != null ? Optional.ofNullable(descriptor.getComponent(columnName))
                .map(Component::getTypeDescriptor)
                .map(SimpleTypeDescriptor.class::cast)
                .map(SimpleTypeDescriptor::getPrimitiveType)
                .map(PrimitiveType::getName)
                .orElse(STRING_TYPE) : STRING_TYPE);
        DataModel dataModel = (descriptor != null ? descriptor.getDataModel() : null);
        Object javaValue = javaValue(resultSet, columnIndex, typeName, dataModel);
        entity.setComponent(columnName, javaValue);
    });