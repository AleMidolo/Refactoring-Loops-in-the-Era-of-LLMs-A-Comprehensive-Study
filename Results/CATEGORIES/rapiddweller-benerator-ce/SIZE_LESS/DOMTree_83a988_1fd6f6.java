for (int i = 0; i < nodes.getLength(); i++) {
    Element element = (Element) nodes.item(i);
    Entity entity = XMLPlatformUtil.convertElement2Entity(element, this);
    list.add(entity);
}