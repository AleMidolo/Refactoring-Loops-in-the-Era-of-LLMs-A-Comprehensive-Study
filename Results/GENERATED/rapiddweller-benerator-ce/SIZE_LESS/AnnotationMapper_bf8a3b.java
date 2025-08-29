properties.stream()
    .map(property -> resolveProperty(property, bean, context))
    .forEach(value -> BeanUtil.setPropertyValue(bean, value.name(), value, true, true));