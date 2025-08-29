childNodes.stream()
        .filter(childNode -> childNode instanceof Element)
        .map(childNode -> (Element) childNode)
        .filter(childElement -> childElement.getChildNodes().getLength() == 1)
        .map(childElement -> childElement.getChildNodes().item(0))
        .filter(grandchild -> grandchild instanceof Text)
        .forEach(grandchild -> {
            String childElementName = grandchild.getParentNode().getNodeName();
            String attributeName = XMLPlatformUtil.normalizeName(childElementName);
            entity.setComponent(attributeName, grandchild.getTextContent());
        });