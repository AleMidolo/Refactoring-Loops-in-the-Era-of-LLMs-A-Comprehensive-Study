IntStream.range(0, names.getLength())
    .mapToObj(names::item)
    .map(Node::getTextContent)
    .forEach(name -> assertTrue("Not an anonymized name: " + name, anonNames.contains(name)));