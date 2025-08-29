for (int i = 0; i < namespaceCount; i++) {
    ObjectNode namespace = ParsingUtilities.mapper.createObjectNode();
    namespaces.add(namespace);
    JSONUtilities.safePut(namespace, "p", parser.getNamespacePrefix(i));
    JSONUtilities.safePut(namespace, "uri", parser.getNamespaceURI(i));
}