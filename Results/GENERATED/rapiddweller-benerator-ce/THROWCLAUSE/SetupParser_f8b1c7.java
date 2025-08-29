attrMap.keySet()
        .stream()
        .map(key -> (Attr) attrMap.get(key))
        .filter(attr -> ATTR_SUPPORT.hasAttribute(attr.getName()))
        .forEach(attr -> {
            try {
                map.put(attr.getName(), attr.getValue());
            } catch (Exception e) {
                throw illegalAttributeValue(attr);
            }
        });