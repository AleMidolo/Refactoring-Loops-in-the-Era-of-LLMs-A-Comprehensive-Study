IntStream.range(0, paramTypes.length)
    .mapToObj(i -> {
        TypeDescriptor elementType = dataModel.getTypeDescriptor(paramTypes[i].getName());
        BeanDescriptorProvider beanDescriptorProvider = dataModel.getBeanDescriptorProvider();
        ArrayElementDescriptor elementDescriptor = new ArrayElementDescriptor(i, beanDescriptorProvider, elementType);
        if (elementDescriptor.isNullable() == null) {
            if (BeanUtil.isPrimitiveType(paramTypes[i].getName())) {
                elementDescriptor.setNullable(false);
            } else {
                elementDescriptor.setNullable(elementDescriptor.getNullQuota() == null || ((Double) elementDescriptor.getDetailValue("nullQuota")) != 0.);
            }
        }
        return elementDescriptor;
    })
    .forEach(nativeDescriptor::addElement);