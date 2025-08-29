getMetaModelElements(rootElement).stream()
    .map(Element::getAttribute)
    .map(source -> context.getDataModel().getDescriptorProvider(source))
    .filter(Objects::nonNull)
    .map(descriptorProvider -> descriptorProvider.getClass())
    .filter(sourceClass -> CustomStorageSystem.class.isAssignableFrom(sourceClass))
    .map(element -> elementToInstanceDescriptorParser.parse(element, context).getTypeDescriptor())
    .peek(typeDescriptor -> typeDescriptor.setDetailValue(META_MODEL, true))
    .map(descriptorProvider -> CustomStorageSystem.class.cast(descriptorProvider))
    .forEach(customStorageSystem -> {
        customStorageSystem.addTypeDescriptor(typeDescriptor);
        logger.info("Created meta model for {} and added it to {}.", typeDescriptor.getName(), source);
    });