for (Element child : children) {
    String nodeName = localName(child);
    if (EXTENSION.equals(nodeName)) {
        parseExtension(child, owner);
    } else if (RESTRICTION.equals(nodeName)) {
        parseComplexRestriction(child, owner);
    } else {
        throw unsupportedElementType(child, complexContent);
    }
}