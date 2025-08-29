getParts().stream()
    .filter(instance -> instance instanceof ComponentDescriptor)
    .map(instance -> (ComponentDescriptor) instance)
    .forEach(result::add);