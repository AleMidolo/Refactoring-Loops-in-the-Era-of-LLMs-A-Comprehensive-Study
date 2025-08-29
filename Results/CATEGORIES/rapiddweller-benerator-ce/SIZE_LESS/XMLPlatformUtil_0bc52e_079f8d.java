for (int i = 0; i < targetAttributes.getLength(); i++) {
    Node attribute = targetAttributes.item(i);
    if (normalizeName(attribute.getNodeName()).equals(componentName)) {
        target.setAttribute(componentName, convertToString(componentValue));
        return;
    }
}