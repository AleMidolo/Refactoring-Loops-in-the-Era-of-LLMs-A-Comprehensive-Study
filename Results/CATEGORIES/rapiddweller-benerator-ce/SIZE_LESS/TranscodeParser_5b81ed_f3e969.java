for (Element child : XMLUtil.getChildElements(element)) {
    String childName = child.getNodeName();
    if (!MEMBER_ELEMENTS.contains(childName)) {
        result.addSubStatement(context.parseChildElement(child, currentXmlPath, currentPath));
    }
}