XMLUtil.getChildElements(element)
    .stream()
    .map(XMLUtil::localName)
    .filter(COMPONENT_TYPES::contains)
    .map(child -> new ModelParser(context, true).parseSimpleTypeComponent(child, null, null))
    .forEach(context::setDefaultComponentConfig);