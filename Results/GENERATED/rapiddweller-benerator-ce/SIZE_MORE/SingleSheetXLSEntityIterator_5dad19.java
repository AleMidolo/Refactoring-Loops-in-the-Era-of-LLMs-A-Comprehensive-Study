Arrays.stream(rawData)
    .filter(cellValue -> cellValue instanceof String && ((String) cellValue).startsWith(colRefPrefix))
    .forEach(i -> {
        String tabName = ((String) rawData[i]).substring(colRefPrefix.length());
        ComponentDescriptor component = entityDescriptor.getComponent(headers[i]);
        ComplexTypeDescriptor componentType = (component != null ? (ComplexjsonTypeDescriptor) component.getTypeDescriptor() : null);
        rawData[i] = mapTabToArray(tabName, componentType);
});