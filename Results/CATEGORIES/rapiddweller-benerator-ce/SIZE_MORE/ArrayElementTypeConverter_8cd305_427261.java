for (int i = 0; i < array.length; i++) {
    ArrayElementDescriptor elementDescriptor = type.getElement(i, true);
    if (elementDescriptor != null) {
        TypeDescriptor elementType = elementDescriptor.getTypeDescriptor();
        Object elementValue = array[i];
        if (elementType instanceof SimpleTypeDescriptor) {
            PrimitiveType primitive = ((SimpleTypeDescriptor) elementType).getPrimitiveType();
            if (primitive == null) {
                primitive = PrimitiveType.STRING;
            }
            Class<?> javaType = primitive.getJavaType();
            Object javaValue = AnyConverter.convert(elementValue, javaType);
            array[i] = javaValue;
        } else {
            array[i] = elementValue;
        }
    }
}