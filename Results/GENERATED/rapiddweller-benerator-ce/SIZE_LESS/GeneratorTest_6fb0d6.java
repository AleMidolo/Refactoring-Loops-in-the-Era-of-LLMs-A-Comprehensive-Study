entities.stream()
    .map(entity -> entity.get(componentName))
    .filter(matcher::accept)
    .forEach(component -> matchCount++);