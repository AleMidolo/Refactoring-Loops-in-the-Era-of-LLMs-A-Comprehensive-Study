targetAttributes.stream()
    .map(targetAttributes::item)
    .filter(attribute -> normalizeName(attribute.getNodeName()).equals(componentName))
    .findFirst()
    .ifPresent(attribute -> {
        target.setAttribute(componentName, convertToString(componentValue));
    });