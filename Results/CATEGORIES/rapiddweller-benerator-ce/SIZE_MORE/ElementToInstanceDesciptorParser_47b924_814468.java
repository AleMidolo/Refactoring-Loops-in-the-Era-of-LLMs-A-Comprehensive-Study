for (Map.Entry<String, String> attribute : XMLUtil.getAttributes(element).entrySet()) {
    String attributeName = attribute.getKey();
    if (!CREATE_ENTITIES_EXT_SETUP.contains(attributeName)) {
        Object attributeValue = attribute.getValue();
        if (isMetaData(instance.getLocalType()) || !instance.supportsDetail(attributeName)) {
            instance.getLocalType().setDetailValue(attributeName, attributeValue);
        }
        if (instance.supportsDetail(attributeName)) {
            instance.setDetailValue(attributeName, attributeValue);
        }
    }
}