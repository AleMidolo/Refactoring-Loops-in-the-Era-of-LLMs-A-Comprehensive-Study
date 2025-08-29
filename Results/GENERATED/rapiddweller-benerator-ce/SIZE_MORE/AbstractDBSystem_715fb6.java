componentDescriptors.stream()
    .map(ComponentDescriptor::getName)
    .filter(columnName -> !ignoreColumn(componentDescriptors, entityDescriptor, columnName))
    .map(colDescriptor -> getWriteColumnInfo(entity, entityDescriptor, table, colDescriptor, specialTypes))
    .forEach(info -> {
        String columnName = info.getColumnName();
        if (pkColumnNames.contains(columnName)) {
            pkInfos.add(info);
        } else {
            normalInfos.add(info);
        }
    });