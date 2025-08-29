for (Element child : children) {
    String nodeName = localName(child);
    if (COMPLEX_TYPE.equals(nodeName)) {
        ComplexTypeDescriptor type = parseComplexType(child, name, annotation, false);
        descriptor = new PartDescriptor(name, this, type);
        annotation = null;
    } else if (SIMPLE_TYPE.equals(nodeName)) {
        SimpleTypeDescriptor simpleType = parseSimpleType(name, child);
        ComplexTypeDescriptor complexType = wrapSimpleTypeWithComplexType(simpleType);
        descriptor = new PartDescriptor(name, this, complexType);
    } else if (KEY.equals(nodeName)) {
        parseKey(child);
    } else if (KEYREF.equals(nodeName)) {
        parseKeyRef(child);
    } else if (UNIQUE.equals(nodeName)) {
        parseUnique(child);
    } else if (ANNOTATION.equals(nodeName)) {
        annotation = new Annotation(child);
    } else {
        throw unsupportedElementType(child, element);
    }
}