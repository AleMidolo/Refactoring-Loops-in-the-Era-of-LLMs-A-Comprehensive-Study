for (Map.Entry<String, Object> entry : components.entrySet()) {
    String componentName = entry.getKey();
    ComponentDescriptor componentDescriptor = type.getComponent(componentName);
    if (componentDescriptor != null) {
        TypeDescriptor componentType = componentDescriptor.getTypeDescriptor();
        Object componentValue = entry.getValue();
        if (componentDescriptor.getContainer() != null) {
            components.put(componentName, null);
        } else if (componentType instanceof SimpleTypeDescriptor) {
            Object javaValue = DescriptorUtil.convertType(componentValue, (SimpleTypeDescriptor) componentType);
            components.put(componentName, javaValue);
        } else if (componentValue instanceof Entity) {
            components.put(componentName, convert((Entity) componentValue, (ComplexTypeDescriptor) componentType));
        } else if (componentValue.getClass().isArray()) {
            int n = Array.getLength(componentValue);
            ArrayBuilder<Entity> builder = new ArrayBuilder<>(Entity.class, n);
            for (int i = 0; i < n; i++) {
                Entity item = (Entity) Array.get(componentValue, i);
                builder.add(convert(item, (ComplexTypeDescriptor) componentType));
            }
            components.put(componentName, builder.toArray());
        } else if (componentValue instanceof Collection) {
            Collection<Entity> collection = (Collection<Entity>) componentValue;
            ArrayBuilder<Entity> builder = new ArrayBuilder<>(Entity.class, collection.size());
            for (Entity item : collection) {
                builder.add(convert(item, (ComplexTypeDescriptor) componentType));
            }
            components.put(componentName, builder.toArray());
        } else {
            throw BeneratorExceptionFactory.getInstance().configurationError("Expected complex data type for '" + componentName + "' but got " + componentValue.getClass());
        }
    }
}