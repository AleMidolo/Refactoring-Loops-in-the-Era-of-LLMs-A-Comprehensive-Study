for (int i = 0; i < atts.getLength(); i++) {
    Node att = atts.item(i);
    String name = XMLPlatformUtil.normalizeName(att.getNodeName());
    entity.setComponent(name, att.getNodeValue());
}