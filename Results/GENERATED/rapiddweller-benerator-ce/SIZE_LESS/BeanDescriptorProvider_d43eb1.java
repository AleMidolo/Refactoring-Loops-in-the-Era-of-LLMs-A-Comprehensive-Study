BeanUtil.getPropertyDescriptors(javaType)
    .forEach(propertyDescriptor -> createDescriptorForProperty(propertyDescriptor, td));