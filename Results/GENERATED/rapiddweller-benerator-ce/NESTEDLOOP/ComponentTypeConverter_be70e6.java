components.entrySet().stream()
    .forEach(entry -> {
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
                IntStream.range(0, n)
                    .forEach(i -> {
                        Entity item = (Entity) Array.get(componentValue, i);
                        builder.add(convert(item, (ComplexTypeDescriptor) componentType));
                    });
                components.put(componentName, builder.toArray());
            } else if (componentValue instanceof Collection) {
                Collection<Entity> collection = (Collection<Entity>) componentValue;
                ArrayBuilder<Entity> builder = new ArrayBuilder<>(Entity.class, collection.size());
                collection.stream()
                    .forEach(item -> builder.add(convert(item, (ComplexTypeDescriptor) componentType)));
                components.put(componentName, builder.toArray());
            } else {
                throw BeneratorExceptionFactory.getInstance().configurationError("Expected complex data type for '" + componentName + "' but got " + componentValue.getClass());
            }
        }
    });