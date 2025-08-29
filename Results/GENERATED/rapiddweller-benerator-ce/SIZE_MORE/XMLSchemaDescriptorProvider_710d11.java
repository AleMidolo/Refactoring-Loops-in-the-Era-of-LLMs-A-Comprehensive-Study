children.stream()
    .forEach(child -> {
        String nodeName = localName(child);
        if (COMPLEX_TYPE.equals(nodeName)) {
            descriptor = parseComplexType(child, name, annotation, false);
            annotation = null;
        } else if (SIMPLE_TYPE.equals(nodeName)) {
            descriptor = parseSimpleType(name, child);
        } else if (KEY.equals(nodeName)) {
            parseKey(child);
        } else if (KEYREF.equals(nodeName)) {
            parseKeyRef(child);
        } else if (ANNOTATION.equals(nodeName)) {
            annotation = new Annotation(child);
        } else {
            throw unsupportedElementType(child, element);
        }
});