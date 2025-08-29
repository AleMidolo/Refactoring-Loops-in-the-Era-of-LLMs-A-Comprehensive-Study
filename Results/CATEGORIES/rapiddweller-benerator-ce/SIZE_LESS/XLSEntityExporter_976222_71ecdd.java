for (Map.Entry<String, Object> component : getComponents(entity)) {
    render(row, i++, component.getValue());
}