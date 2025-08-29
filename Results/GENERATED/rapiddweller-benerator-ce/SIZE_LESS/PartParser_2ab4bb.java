XMLUtil.getChildElements(element).stream()
    .forEach(childElement -> parseComponentGeneration(childElement, (ComplexTypeDescriptor) result.getLocalType(true)));