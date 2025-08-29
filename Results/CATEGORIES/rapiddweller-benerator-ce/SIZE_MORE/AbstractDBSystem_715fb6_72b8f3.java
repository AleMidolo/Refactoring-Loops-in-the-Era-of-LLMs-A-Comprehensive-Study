for (ComponentDescriptor colDescriptor : componentDescriptors) {
    String columnName = colDescriptor.getName();
    if (!ignoreColumn(colDescriptor, entityDescriptor, columnName)) {
        ColumnInfo info = getWriteColumnInfo(entity, entityDescriptor, table, colDescriptor, specialTypes);
        if (pkColumnNames.contains(columnName)) {
            pkInfos.add(info);
        } else {
            normalInfos.add(info);
        }
    }
}