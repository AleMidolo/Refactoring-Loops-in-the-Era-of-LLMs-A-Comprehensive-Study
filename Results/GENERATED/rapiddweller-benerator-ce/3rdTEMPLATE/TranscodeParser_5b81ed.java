XMLUtil.getChildElements(element).stream()
    .filter(child -> !MEMBER_ELEMENTS.contains(child.getNodeName()))
    .forEach(child -> result.addSubStatement(context.parseChildElement(child, currentXmlPath, currentPath));