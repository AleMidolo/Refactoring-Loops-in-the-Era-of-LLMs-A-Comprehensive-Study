IntStream.range(0, attributeCount)
    .mapToObj(i -> {
        ObjectNode attribute = ParsingUtilities.mapper.createObjectNode();
        attributes.add(attribute);
        JSONUtilities.safePut(attribute, "n", parser.getAttributeLocalName(i));
        JSONUtilities.safePut(attribute, "v", parser.getAttributeValue(i));
        String prefix = parser.getAttributePrefix(i);
        if (prefix != null) {
            JSONUtilities.safePut(attribute, "p", prefix);
        }
        return attribute;
    })
    .collect(Collectors.toList());