for (PropertyDescriptor descriptor : BeanUtil.getPropertyDescriptors(bean.getClass())) {
    if (!"class".equals(descriptor.getName())) {
        entity.setComponent(descriptor.getName(), BeanUtil.getPropertyValue(bean, descriptor.getName()));
    }
}