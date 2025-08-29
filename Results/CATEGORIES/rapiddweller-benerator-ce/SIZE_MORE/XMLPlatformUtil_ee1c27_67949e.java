for (int i = 0; i < childNodes.getLength(); i++) {
    Node childNode = childNodes.item(i);
    if (childNode instanceof Element) {
        Element childElement = (Element) childNode;
        if (componentName.equals(normalizeName(childElement.getNodeName()))) {
            childElement.setTextContent(convertToString(componentValue));
        }
    }
}