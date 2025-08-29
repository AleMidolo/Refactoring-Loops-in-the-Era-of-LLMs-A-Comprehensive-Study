
children.stream()
    .map(child -> localName(child))
    .forEach(nodeName -> {
        if (ATTRIBUTE.equals(nodeName)) {
            parseAttribute(child, owner);
        } else {
            throw unsupportedElementType(child, restrictionElement);
        }
    });