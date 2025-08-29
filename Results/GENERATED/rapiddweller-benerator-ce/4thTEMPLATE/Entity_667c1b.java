this.components.entrySet().stream()
    .forEach(component -> component.setValue(copyOrSelf(component.getValue()));