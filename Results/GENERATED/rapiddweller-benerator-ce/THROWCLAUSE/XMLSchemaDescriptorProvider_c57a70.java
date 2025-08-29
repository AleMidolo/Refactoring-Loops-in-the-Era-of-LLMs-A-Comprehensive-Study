childElements.stream()
    .forEach(element -> {
        String nodeName = localName(element);
        switch(nodeName) {
            case ELEMENT:
                parseTopLevelElement(element);
                break;
            case COMPLEX_TYPE:
                parseComplexType(element, null, null, true);
                break;
            case SIMPLE_TYPE:
                addTypeDescriptor(parseSimpleType(null, element));
                break;
            case GROUP:
                parseGroup(element);
                break;
            case ATTRIBUTE_GROUP:
                parseAttributeGroup(element);
                break;
            case IMPORT:
                parseImport(element);
                break;
            case INCLUDE:
                parseDetailsOfInclude(element);
                break;
            default:
                throw unsupportedElementType(element, root);
        }
    });