for (Element childElement : XMLUtil.getChildElements(element)) {
    parseComponentGeneration(childElement, (ComplexTypeDescriptor) result.getLocalType(true));
}