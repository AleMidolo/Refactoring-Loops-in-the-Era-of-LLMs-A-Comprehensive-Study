attrMap.asList().stream()
    .filter(attr -> ATTR_SUPPORT.hasAttribute(attr.getName()))
    .forEach(attr -> {
        try {
            map.put(attr.getName(), attr.getValue());
        } catch (Exception e) {
            throw illegalAttributeValue(attr);
        }
    });