for (Map.Entry<String, Object> component : source.getComponents().entrySet()) {
    mapComponent(component.getKey(), component.getValue(), target);
}