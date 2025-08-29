XMLUtil.getChildElements(simpleContentElement).stream()
    .forEach(child -> {
        String localName = localName(child);
        if (ANNOTATION.equals(localName)) {
            annotation = new Annotation(child);
        } else if (RESTRICTION.equals(localName)) {
            parseSimpleContentRestriction(child, complexType);
        } else if (EXTENSION.equals(localName)) {
            parseSimpleContentExtension(child, complexType);
        } else {
            throw unsupportedElementType(child, simpleContentElement);
        }
    });