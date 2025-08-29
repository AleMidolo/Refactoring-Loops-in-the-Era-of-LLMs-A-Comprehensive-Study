for (int i = 0; i < attrMap.getLength(); i++) {
    Attr attr = (Attr) attrMap.item(i);
    if (ATTR_SUPPORT.hasAttribute(attr.getName())) {
        try {
            map.put(attr.getName(), attr.getValue());
        } catch (Exception e) {
            throw illegalAttributeValue(attr);
        }
    } else if (!isStandardXmlRootAttribute(attr.getName())) {
        throw BeneratorExceptionFactory.getInstance().illegalXmlAttributeName(null, null, attrSupport.getErrorIdForIllegalAttribute(), attr, attrSupport);
    }
}