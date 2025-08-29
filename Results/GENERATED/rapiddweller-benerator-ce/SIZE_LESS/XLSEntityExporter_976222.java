getComponents(entity).entrySet().stream()
    .forEach(component -> render(row, i++, component.getValue()));