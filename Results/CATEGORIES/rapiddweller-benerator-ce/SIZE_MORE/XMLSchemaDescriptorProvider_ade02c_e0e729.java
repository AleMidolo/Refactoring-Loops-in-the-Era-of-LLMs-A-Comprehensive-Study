for (Element element : childElements) {
    String nodeName = localName(element);
    String nameAttribute = element.getAttribute("name");
    Set<String> complexElements = CollectionUtil.toSet(COMPLEX_TYPE, GROUP, ATTRIBUTE_GROUP);
    if (complexElements.contains(nodeName)) {
        addTypeDescriptor(new ComplexTypeDescriptor(nameAttribute, this));
    } else if (SIMPLE_TYPE.equals(nodeName)) {
        addTypeDescriptor(new SimpleTypeDescriptor(nameAttribute, this));
    } else if (ELEMENT.equals(nodeName)) {
        String typeName = element.getAttribute("type");
        if (!StringUtil.isEmpty(typeName)) {
            TypeDescriptor elementType = dataModel.getTypeDescriptor(typeName);
            if (elementType instanceof SimpleTypeDescriptor) {
                addTypeDescriptor(new SimpleTypeDescriptor(nameAttribute, this));
            } else if (elementType instanceof ComplexTypeDescriptor) {
                addTypeDescriptor(new ComplexTypeDescriptor(nameAttribute, this));
            } else {
                addTypeDescriptor(new UnresolvedTypeDescriptor(nameAttribute, this, typeName));
            }
        } else if (XMLUtil.getChildElements(element, false, COMPLEX_TYPE).length > 0) {
            addTypeDescriptor(new ComplexTypeDescriptor(nameAttribute, this));
        } else if (XMLUtil.getChildElements(element, false, SIMPLE_TYPE).length > 0) {
            addTypeDescriptor(new SimpleTypeDescriptor(nameAttribute, this));
        } else {
            addTypeDescriptor(new ComplexTypeDescriptor(nameAttribute, this));
        }
    } else if (ANNOTATION.equals(nodeName)) {
        parseDocumentAnnotation(element);
    } else if (IMPORT.equals(nodeName)) {
        parseImport(element);
    } else if (INCLUDE.equals(nodeName)) {
        parseStructureOfInclude(element);
    }
}