for (Element child : XMLUtil.getChildElements(element)) {
    String childType = XMLUtil.localName(child);
    if (COMPONENT_TYPES.contains(childType)) {
        ModelParser parser = new ModelParser(context, true);
        ComponentDescriptor component = parser.parseSimpleTypeComponent(child, null, null);
        context.setDefaultComponentConfig(component);
    } else {
        throw BeneratorExceptionFactory.getInstance().configurationError("Unexpected element: " + childType);
    }
}