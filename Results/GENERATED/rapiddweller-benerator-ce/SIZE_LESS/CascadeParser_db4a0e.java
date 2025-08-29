XMLUtil.getChildElements(element).stream()
    .map(Element::getNodeName)
    .filter(childName -> !MEMBER_ELEMENTS.contains(childName))
    .forEach(child -> result.addSubStatement(context.parseChildElement(child, parentXmlPath, currentPath));