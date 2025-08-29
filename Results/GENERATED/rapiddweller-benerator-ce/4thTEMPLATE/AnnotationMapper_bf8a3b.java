properties.stream()
    .map(property -> resolveProperty(property, bean, context))
    .forEach(value -> BeanUtil.setPropertyValue(bean, property.name(), value, true, true));