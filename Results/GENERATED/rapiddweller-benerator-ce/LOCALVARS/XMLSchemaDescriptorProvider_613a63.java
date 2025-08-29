children.stream()
    .forEach(child -> {
        String nodeName = localName(child);
        switch (nodeName) {
            case COMPLEX_TYPE:
                ComplexTypeDescriptor type = parseComplexType(child, name, annotation, false);
                descriptor = new PartDescriptor(name, this, type);
                annotation = null;
                break;
            case SIMPLE_TYPE:
                SimpleTypeDescriptor simpleType = parseSimpleType(name, child);
                ComplexTypeDescriptor complexType = wrapSimpleTypeWithComplexType(simpleType);
                descriptor = new PartDescriptor(name, this, complexType);
                break;
            case KEY:
                parseKey(child);
                break;
            case KEYREF:
                parseKeyRef(child);
                break;
            case UNIQUE:
                parseUnique(child);
                break;
            case ANNOTATION:
                annotation = new Annotation(child);
                break;
            default:
                throw unsupportedElementType(child, element);
        }
    });