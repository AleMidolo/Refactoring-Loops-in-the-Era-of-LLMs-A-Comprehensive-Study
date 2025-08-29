for (int i = 0; i < rawData.length; i++) {
    Object cellValue = rawData[i];
    if (cellValue instanceof String && ((String) cellValue).startsWith(colRefPrefix)) {
        String tabName = ((String) cellValue).substring(colRefPrefix.length());
        ComponentDescriptor component = entityDescriptor.getComponent(headers[i]);
        ComplexTypeDescriptor componentType = (component != null ? (ComplexTypeDescriptor) component.getTypeDescriptor() : null);
        rawData[i] = mapTabToArray(tabName, componentType);
    }
}