children.stream()
    .forEach(child -> {
        String nodeName = localName(child);
        if (ANNOTATION.equals(nodeName)) {
            annotation = new Annotation(child);
        } else if (SIMPLE_TYPE.equals(nodeName)) {
            descriptor = new PartDescriptor(name, this, parseSimpleType(null, child));
        } else {
            throw unsupportedElementType(child, attributeElement);
        }
    });