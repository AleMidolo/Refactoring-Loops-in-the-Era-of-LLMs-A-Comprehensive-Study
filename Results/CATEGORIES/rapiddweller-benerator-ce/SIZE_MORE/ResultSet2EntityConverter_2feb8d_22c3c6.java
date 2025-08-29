for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
    String columnName = metaData.getColumnName(columnIndex);
    String typeName;
    if (descriptor != null) {
        ComponentDescriptor component = descriptor.getComponent(columnName);
        if (component != null) {
            SimpleTypeDescriptor type = (SimpleTypeDescriptor) component.getTypeDescriptor();
            PrimitiveType primitiveType = type.getPrimitiveType();
            typeName = (primitiveType != null ? primitiveType.getName() : STRING_TYPE);
        } else {
            typeName = STRING_TYPE;
        }
    } else {
        typeName = STRING_TYPE;
    }
    DataModel dataModel = (descriptor != null ? descriptor.getDataModel() : null);
    Object javaValue = javaValue(resultSet, columnIndex, typeName, dataModel);
    entity.setComponent(columnName, javaValue);
}