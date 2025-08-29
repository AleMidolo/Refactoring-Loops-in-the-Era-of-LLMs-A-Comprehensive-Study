IntStream.range(0, nodes.getLength())
        .mapToObj(nodes::item)
        .map(Element.class::cast)
        .map(element -> XMLPlatformUtil.convertElement2Entity(element, this))
        .forEach(list::add);