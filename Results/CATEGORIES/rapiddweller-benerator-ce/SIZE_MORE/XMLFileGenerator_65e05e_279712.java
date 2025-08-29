for (Object component : entity.getComponents().values()) {
    if (component == null) {
        continue;
    }
    if (component instanceof Entity) {
        process((Entity) component, exporter);
    } else if (component.getClass().isArray()) {
        Object[] array = (Object[]) component;
        for (Object element : array) {
            if (element instanceof Entity) {
                process((Entity) element, exporter);
            }
        }
    }
}