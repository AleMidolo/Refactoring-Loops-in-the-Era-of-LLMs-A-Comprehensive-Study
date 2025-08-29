children.stream()
    .map(child -> localName(child))
    .forEach(nodeName -> {
        if (SIMPLE_TYPE.equals(nodeName)) {
            descriptor.addAlternative(parseSimpleType(null, child));
        } else {
            throw unsupportedElementType(child, union);
        }
    });