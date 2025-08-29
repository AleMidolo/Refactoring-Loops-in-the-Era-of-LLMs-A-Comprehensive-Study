IntStream.range(0, attributes.getLength())
    .mapToObj(attributes::item)
    .map(attr -> parseStringAttribute((Attr) attr, context))
    .forEach(detailValue -> descriptor.setDetailValue(((Attr) attributes.item(i)).getName(), detailValue));