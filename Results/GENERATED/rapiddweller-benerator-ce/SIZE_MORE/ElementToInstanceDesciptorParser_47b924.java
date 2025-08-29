XMLUtil.getAttributes(element).entrySet().stream()
    .filter(attribute -> !CREATE_ENTITIES_EXT_SETUP.contains(attribute.getKey()))
    .forEach(attribute -> {
        String attributeName = attribute.getKey();
        Object attributeValue = attribute.getValue();
        if (isMetaData(instance.getLocalType()) || !instance.supportsDetail(attributeName)) {
            instance.getLocalType().setDetailValue(attributeName, attributeValue);
        }
        if (instance.supportsDetail(attributeName)) {
            instance.setDetailValue(attributeName, attributeValue);
        }
    });