for (PrimitiveType type : PrimitiveType.getInstances()) {
    addTypeDescriptor(new SimpleTypeDescriptor(type.getName(), this, type.getName()));
}