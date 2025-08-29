for (Element child : children) {
    String nodeName = localName(child);
    if (ATTRIBUTE.equals(nodeName)) {
        parseAttribute(child, owner);
    } else {
        throw unsupportedElementType(child, restrictionElement);
    }
}