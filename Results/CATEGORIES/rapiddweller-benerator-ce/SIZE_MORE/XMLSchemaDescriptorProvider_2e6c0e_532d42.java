for (Element child : children) {
    String nodeName = localName(child);
    if (SIMPLE_TYPE.equals(nodeName)) {
        descriptor.addAlternative(parseSimpleType(null, child));
    } else {
        throw unsupportedElementType(child, union);
    }
}