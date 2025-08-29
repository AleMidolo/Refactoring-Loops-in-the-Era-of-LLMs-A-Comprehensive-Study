descriptor.getDetails().stream()
    .filter(detail -> !ATT_NAME.equals(detail.getName()))
    .forEach(detail -> mapDetailToBeanProperty(descriptor, detail.getName(), bean, context));