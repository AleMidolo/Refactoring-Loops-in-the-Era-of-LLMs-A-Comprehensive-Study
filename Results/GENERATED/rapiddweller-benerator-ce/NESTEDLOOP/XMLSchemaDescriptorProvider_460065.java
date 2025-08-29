children.stream()
    .forEach(child -> {
        String nodeName = localName(child);
        if (ANNOTATION.equals(nodeName)) {
            annotation = new Annotation(child);
        } else if (SEQUENCE.equals(nodeName)) {
            parseSequence(child, descriptor);
        } else if (COMPLEX_CONTENT.equals(nodeName)) {
            parseComplexContent(child, descriptor);
        } else if (ALL.equals(nodeName)) {
            parseAll(child, descriptor);
        } else if (SIMPLE_CONTENT.equals(nodeName)) {
            parseSimpleContent(child, descriptor);
        } else if (ATTRIBUTE.equals(nodeName)) {
            parseAttribute(child, descriptor);
        } else if (ATTRIBUTE_GROUP.equals(nodeName)) {
            ComplexTypeDescriptor group = parseAttributeGroup(child);
            group.getParts().forEach(component -> descriptor.addPart(component));
        } else {
            throw unsupportedElementType(child, complexTypeElement);
        }
    });