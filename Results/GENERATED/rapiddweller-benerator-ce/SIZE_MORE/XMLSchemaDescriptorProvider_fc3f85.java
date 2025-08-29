children.stream()
    .forEach(child -> {
        String nodeName = localName(child);
        if (ATTRIBUTE.equals(nodeName)) {
            parseAttribute(child, owner);
        } else {
            throw unsupportedElementType(child, restrictionElement);
        }
    });