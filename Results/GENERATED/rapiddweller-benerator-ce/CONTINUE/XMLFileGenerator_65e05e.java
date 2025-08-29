entity.getComponents().values().stream()
    .filter(Objects::nonNull)
    .forEach(component -> {
        if (component instanceof Entity) {
            process((Entity) component, exporter);
        } else if (component.getClass().isArray()) {
            Object[] array = (Object[]) component;
            Arrays.stream(array)
                .filter(obj -> obj instanceof Entity)
                .forEach(element -> process((Entity) element, exporter));
        }
    });