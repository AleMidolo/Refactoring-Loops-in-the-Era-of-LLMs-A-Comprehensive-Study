childElements.stream()
    .forEach(element -> {
        String nodeName = localName(element);
        if (ELEMENT.equals(nodeName)) {
            parseTopLevelElement(element);
        } else if (COMPLEX_TYPE.equals(nodeName)) {
            parseComplexType(element, null, null, true);
        } else if (SIMPLE_TYPE.equals(nodeName)) {
            addTypeDescriptor(parseSimpleType(null, element));
        } else if (GROUP.equals(nodeName)) {
            parseGroup(element);
        } else if (ATTRIBUTE_GROUP.equals(nodeName)) {
            parseAttributeGroup(element);
        } else if (IMPORT.equals(nodeName)) {
            parseImport(element);
        } else if (INCLUDE.equals(nodeName)) {
            parseDetailsOfInclude(element);
        } else if (!ANNOTATION.equals(nodeName)) {
            throw unsupportedElementType(element, root);
        }
    });