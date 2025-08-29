XMLUtil.getChildElements(simpleType).stream()
    .forEach(child -> {
        String localName = localName(child);
        switch (localName) {
            case ANNOTATION:
                annotation = new Annotation(child);
                break;
            case UNION:
                descriptor = parseUnion(child, name);
                break;
            case RESTRICTION:
                descriptor = parseSimpleTypeRestriction(child, name);
                break;
            default:
                throw unsupportedElementType(child, simpleType);
        }
    });