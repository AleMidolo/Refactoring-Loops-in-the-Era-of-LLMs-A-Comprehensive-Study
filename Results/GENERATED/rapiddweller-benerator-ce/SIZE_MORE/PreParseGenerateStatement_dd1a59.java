IntStream.range(0, setupChildNodes.getLength())
    .mapToObj(setupChildNodes::item)
    .filter(node -> node.getNodeName().equals("generate"))
    .forEach(currentNode -> {
        typeDescriptors.addAll(parseGeneratesToTypeDescriptors(currentNode, context));
        if (generatesForTarget(currentNode)) {
            typeDescriptors.add(elementToInstanceDesciptorParser.parse((Element) currentNode, context).getTypeDescriptor());
        }
    });