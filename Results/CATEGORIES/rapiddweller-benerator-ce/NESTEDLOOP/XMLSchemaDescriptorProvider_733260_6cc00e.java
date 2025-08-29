for (Element child : XMLUtil.getChildElements(group)) {
    String elType = XMLUtil.localName(child);
    if (ATTRIBUTE.equals(elType)) {
        parseAttribute(child, type);
    } else if (ATTRIBUTE_GROUP.equals(elType)) {
        ComplexTypeDescriptor childGroup = parseAttributeGroup(child);
        for (InstanceDescriptor component : childGroup.getParts()) {
            type.addPart(component);
        }
    } else if (ANNOTATION.equals(elType)) {
        annotation = new Annotation(child);
    } else {
        throw unsupportedElementType(child, group);
    }
}