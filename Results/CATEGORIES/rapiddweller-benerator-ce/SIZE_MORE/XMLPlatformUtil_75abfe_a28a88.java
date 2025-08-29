for (int i = 0; i < childNodes.getLength(); i++) {
    Node childNode = childNodes.item(i);
    if (childNode instanceof Element) {
        Element childElement = (Element) childNode;
        NodeList grandchildNodes = childElement.getChildNodes();
        if (grandchildNodes.getLength() == 1) {
            Node grandchild = grandchildNodes.item(0);
            if (grandchild instanceof Text) {
                String childElementName = childElement.getNodeName();
                String attributeName = XMLPlatformUtil.normalizeName(childElementName);
                entity.setComponent(attributeName, grandchild.getTextContent());
            }
        }
    }
}