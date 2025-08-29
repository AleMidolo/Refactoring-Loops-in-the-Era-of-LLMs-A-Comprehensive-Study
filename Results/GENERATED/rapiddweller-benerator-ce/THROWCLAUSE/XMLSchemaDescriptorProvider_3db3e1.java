XMLUtil.getChildElements(simpleType).stream()
    .forEach(child -> {
        String localName = localName(child);
        if (ANNOTATION.equals(localName)) {
            annotation = new Annotation(child);
        } else if (UNION.equals(localName)) {
            descriptor = parseUnion(child, name);
        } else if (RESTRICTION.equals(localName)) {
            descriptor = parseSimpleTypeRestriction(child, name);
        } else {
            throw unsupportedElementType(child, simpleType);
        }
    });