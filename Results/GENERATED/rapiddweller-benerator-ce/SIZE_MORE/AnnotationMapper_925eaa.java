for (int i = 0; i < parameterTypes.length; i++) {
    ArrayElementDescriptor parentElement = nativeDescriptor.getElement(i);
    Arrays.stream(paramAnnos[i])
            .filter(this::containsConfig)
            .map(paramAnnotation -> {
                TypeDescriptor parentElementType = parentElement.getTypeDescriptor();
                TypeDescriptor elementType = DescriptorUtil.deriveType(parentElementType.getName(), parentElementType);
                ArrayElementDescriptor element = new ArrayElementDescriptor(i, this, elementType);
                element.setParent(parentElement);
                return element;
            })
            .forEach(element -> {
                Arrays.stream(paramAnnos[i])
                        .forEach(annotation -> mapParamAnnotation(annotation, element, testMethod.getDeclaringClass()));
                type.addElement(element);
            });
}