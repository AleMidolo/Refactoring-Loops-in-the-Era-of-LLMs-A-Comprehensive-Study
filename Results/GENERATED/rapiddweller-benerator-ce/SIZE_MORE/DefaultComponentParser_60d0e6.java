XMLUtil.getChildElements(element).stream()
    .map(XMLUtil::localName)
    .filter(COMPONENT_TYPES::contains)
    .forEach(childType -> {
        ModelParser parser = new ModelParser(context, true);
        ComponentDescriptor component = parser.parseSimpleTypeComponent(XMLUtil.getChildElements(element), null, null);
        context.setDefaultComponentConfig(component);
    });