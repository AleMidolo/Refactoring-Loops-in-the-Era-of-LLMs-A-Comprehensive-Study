for (int i = 0; i < parameterTypes.length; i++) {
    ArrayElementDescriptor parentElement = nativeDescriptor.getElement(i);
    if (containsConfig(paramAnnos[i])) {
        TypeDescriptor parentElementType = parentElement.getTypeDescriptor();
        TypeDescriptor elementType = DescriptorUtil.deriveType(parentElementType.getName(), parentElementType);
        ArrayElementDescriptor element = new ArrayElementDescriptor(i, this, elementType);
        element.setParent(parentElement);
        for (Annotation annotation : paramAnnos[i]) {
            mapParamAnnotation(annotation, element, testMethod.getDeclaringClass());
        }
        type.addElement(element);
    }
}