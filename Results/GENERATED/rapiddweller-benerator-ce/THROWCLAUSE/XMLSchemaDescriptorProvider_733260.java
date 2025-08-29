XMLUtil.getChildElements(group).stream()
    .forEach(child -> {
        String elType = XMLUtil.localName(child);
        if (ATTRIBUTE.equals(elType)) {
            parseAttribute(child, type);
        } else if (ATTRIBUTE_GROUP.equals(elType)) {
            ComplexTypeDescriptor childGroup = parseAttributeGroup(child);
            childGroup.getParts().forEach(component -> type.addPart(component));
        } else if (ANNOTATION.equals(elType)) {
            annotation = new Annotation(child);
        } else {
            throw unsupportedElementType(child, group);
        }
    });