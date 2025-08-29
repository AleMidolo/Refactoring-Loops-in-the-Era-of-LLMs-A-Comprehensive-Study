IntStream.range(0, atts.getLength())
    .mapToObj(atts::item)
    .forEach(att -> entity.setComponent(XMLPlatformUtil.normalizeName(att.getNodeName()), att.getNodeValue()));