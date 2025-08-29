IntStream.range(0, namespaceCount)
        .mapToObj(i -> {
            ObjectNode namespace = ParsingUtilities.mapper.createObjectNode();
            JSONUtilities.safePut(namespace, "p", parser.getNamespacePrefix(i));
            JSONUtilities.safePut(namespace, "uri", parser.getNamespaceURI(i));
            return namespace;
        })
        .forEach(namespaces::add);