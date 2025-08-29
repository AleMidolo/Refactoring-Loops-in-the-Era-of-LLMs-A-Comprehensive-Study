for (Map.Entry<String, Object> component : this.components.entrySet()) {
    Object value = component.getValue();
    component.setValue(copyOrSelf(value));
}