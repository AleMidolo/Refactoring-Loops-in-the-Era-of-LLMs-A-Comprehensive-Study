for (int i = 0; i < setupChildNodes.getLength(); i++) {
    Node currentNode = setupChildNodes.item(i);
    if (currentNode.getNodeName().equals("generate")) {
        typeDescriptors.addAll(parseGeneratesToTypeDescriptors(currentNode, context));
        if (generatesForTarget(currentNode)) {
            typeDescriptors.add(elementToInstanceDesciptorParser.parse((Element) currentNode, context).getTypeDescriptor());
        }
    }
}