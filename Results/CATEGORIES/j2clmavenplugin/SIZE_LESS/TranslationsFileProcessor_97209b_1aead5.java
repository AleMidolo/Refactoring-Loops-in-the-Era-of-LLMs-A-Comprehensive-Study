for (int i = 0; i < node.getChildNodes().getLength(); i++) {
    innerContent.append(getInnerContent(node.getChildNodes().item(i)));
}