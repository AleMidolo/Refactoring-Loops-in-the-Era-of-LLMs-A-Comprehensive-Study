for (Property property : properties) {
    Object value = resolveProperty(property, bean, context);
    BeanUtil.setPropertyValue(bean, property.name(), value, true, true);
}