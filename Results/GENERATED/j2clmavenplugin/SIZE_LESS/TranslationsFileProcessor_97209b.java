String innerContent = IntStream.range(0, node.getChildNodes().getLength())
    .mapToObj(i -> node.getChildNodes().item(i))
    .map(this::getInnerContent)
    .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
    .toString();