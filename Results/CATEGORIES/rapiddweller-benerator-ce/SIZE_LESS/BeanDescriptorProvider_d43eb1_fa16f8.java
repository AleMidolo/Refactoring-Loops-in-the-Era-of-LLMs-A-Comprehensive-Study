for (PropertyDescriptor propertyDescriptor : BeanUtil.getPropertyDescriptors(javaType)) {
    createDescriptorForProperty(propertyDescriptor, td);
}