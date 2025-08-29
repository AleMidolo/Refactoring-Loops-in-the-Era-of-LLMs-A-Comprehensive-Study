for (Element info : infos) {
    String childName = XMLUtil.localName(info);
    if ("bean".equals(childName)) {
        BeanParser.parseBeanExpression(info, true);
    } else if ("variable".equals(childName)) {
        modelParser.parseVariable(info);
    } else if (ATTRIBUTE.equals(childName)) {
        descriptor = (T) modelParser.parseAttribute(info, null, (PartDescriptor) descriptor);
    } else if ("part".equals(childName)) {
        descriptor = (T) modelParser.parsePart(info, null, (PartDescriptor) descriptor);
    } else if (descriptor instanceof ComplexTypeDescriptor) {
        descriptor = (T) complexTypeParser.parse(info, (ComplexTypeDescriptor) descriptor);
    } else if (descriptor instanceof SimpleTypeDescriptor) {
        descriptor = (T) simpleTypeParser.parse(info, (SimpleTypeDescriptor) descriptor);
    } else if ("type".equals(childName)) {
        TypeDescriptor typeDescriptor = (descriptor instanceof InstanceDescriptor ? ((InstanceDescriptor) descriptor).getTypeDescriptor() : (TypeDescriptor) descriptor);
        if (typeDescriptor instanceof SimpleTypeDescriptor) {
            descriptor = (T) simpleTypeParser.parse(info, (SimpleTypeDescriptor) typeDescriptor);
        } else {
            descriptor = (T) complexTypeParser.parse(info, (ComplexTypeDescriptor) typeDescriptor);
        }
    } else {
        throw BeneratorExceptionFactory.getInstance().programmerUnsupported("Unsupported element (" + childName + ") " + "or descriptor type: " + descriptor.getClass().getName());
    }
}