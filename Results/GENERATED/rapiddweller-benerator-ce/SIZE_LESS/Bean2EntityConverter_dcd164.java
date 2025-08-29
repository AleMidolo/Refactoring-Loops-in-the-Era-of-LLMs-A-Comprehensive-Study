BeanUtil.getPropertyDescriptors(bean.getClass())
    .stream()
    .filter(descriptor -> !"class".equals(descriptor.getName()))
    .forEach(descriptor -> entity.setComponent(descriptor.getName(), BeanUtil.getPropertyValue(bean, descriptor.getName()));