for (Element child : children) {
    String nodeName = localName(child);
    String value = child.getAttribute(VALUE);
    if (ENUMERATION.equals(nodeName)) {
        if (PrimitiveType.STRING.equals(descriptor.getPrimitiveType())) {
            descriptor.addValue("'" + value + "'");
        } else {
            descriptor.addValue(value);
        }
    } else if (MIN_INCLUSIVE.equals(nodeName)) {
        descriptor.setMin(value);
        descriptor.setMinInclusive(true);
    } else if (MIN_EXCLUSIVE.equals(nodeName)) {
        descriptor.setMin(value);
        descriptor.setMinInclusive(false);
    } else if (MAX_INCLUSIVE.equals(nodeName)) {
        descriptor.setMax(value);
        descriptor.setMaxInclusive(true);
    } else if (MAX_EXCLUSIVE.equals(nodeName)) {
        descriptor.setMax(value);
        descriptor.setMaxInclusive(false);
    } else if (LENGTH.equals(nodeName)) {
        int length = Integer.parseInt(value);
        descriptor.setMinLength(length);
        descriptor.setMaxLength(length);
    } else if (BeanUtil.hasProperty(descriptor.getClass(), nodeName)) {
        BeanUtil.setPropertyValue(descriptor, nodeName, value, false);
    } else {
        logger.warn("Ignoring restriction {}: {}", nodeName, value);
    }
}