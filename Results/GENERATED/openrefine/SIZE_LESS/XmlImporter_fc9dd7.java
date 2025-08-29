IntStream.range(0, namespaceCount)
    .mapToObj(i -> ParsingUtilities.mapper.createObjectNode())
    .peek(namespaces::add)
    .forEach(namespace -> {
        JSONUtilities.safePut(namespace, "p", parser.getNamespacePrefix(i));
        JSONUtilities.safePut(namespace, "uri", parser.getNamespaceURI(i));
    });