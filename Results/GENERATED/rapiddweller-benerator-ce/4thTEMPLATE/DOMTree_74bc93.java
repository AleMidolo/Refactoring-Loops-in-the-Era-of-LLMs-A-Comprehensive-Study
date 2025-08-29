IntStream.range(0, nodes.getLength())
         .mapToObj(nodes::item)
         .map(Node::getTextContent)
         .forEach(list::add);