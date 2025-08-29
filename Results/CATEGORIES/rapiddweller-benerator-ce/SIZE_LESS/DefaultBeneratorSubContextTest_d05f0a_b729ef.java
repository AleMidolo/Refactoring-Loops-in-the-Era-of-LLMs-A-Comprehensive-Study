for (Object value : values) {
    BeanUtil.setPropertyValue(parent, propertyName, value);
    assertEquals(value, BeanUtil.getPropertyValue(parent, propertyName));
    assertEquals(value, BeanUtil.getPropertyValue(child, propertyName));
}