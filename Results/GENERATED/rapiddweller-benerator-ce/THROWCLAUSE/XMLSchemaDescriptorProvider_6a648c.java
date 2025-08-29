children.stream()
    .forEach(child -> {
        String nodeName = localName(child);
        switch (nodeName) {
            case EXTENSION:
                parseExtension(child, owner);
                break;
            case RESTRICTION:
                parseComplexRestriction(child, owner);
                break;
            default:
                throw unsupportedElementType(child, complexContent);
        }
    });