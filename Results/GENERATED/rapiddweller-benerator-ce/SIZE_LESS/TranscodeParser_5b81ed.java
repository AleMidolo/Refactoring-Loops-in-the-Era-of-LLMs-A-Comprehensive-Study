XMLUtil.getChildElements(element)
    .stream()
    .map(Element::getNodeName)
    .filter(childName -> !MEMBER_ELEMENTS.contains(childName))
    .forEach(childName -> result.addSubStatement(context.parseChildElement(childName, currentXmlPath, currentPath));