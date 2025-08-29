IntStream.range(0, parameterTypes.length)
    .forEach(i -> {
        ArrayElementDescriptor parentElement = nativeDescriptor.getElement(i);
        if (containsConfig(paramAnnos[i])) {
            TypeDescriptor parentElementType = parentElement.getTypeDescriptor();
            TypeDescriptor elementType = DescriptorUtil.deriveType(parentElementType.getName(), parentElementType);
            ArrayElementDescriptor element = new ArrayElementDescriptor(i, this, elementType);
            element.setParent(parentElement);
            Arrays.stream(paramAnnos[i])
                .forEach(annotation -> mapParamAnnotation(annotation, element, testMethod.getDeclaringClass()));
            type.addElement(element);
        }
    });