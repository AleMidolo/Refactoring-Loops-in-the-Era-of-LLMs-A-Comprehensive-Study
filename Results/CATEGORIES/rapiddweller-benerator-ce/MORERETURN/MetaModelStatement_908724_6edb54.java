for (Element element : getMetaModelElements(rootElement)) {
    String source = element.getAttribute(ATT_CONSUMER);
    DescriptorProvider descriptorProvider = context.getDataModel().getDescriptorProvider(source);
    Class<?> sourceClass = context.getDataModel().getDescriptorProvider(source).getClass();
    if (Objects.isNull(descriptorProvider)) {
        logger.error("Cannot create meta model for {} because there is no descriptorProvider.", source);
        return false;
    }
    if (!CustomStorageSystem.class.isAssignableFrom(sourceClass)) {
        logger.error("Could not add {} to {} because the providing object is not a CustomStorageSystem.", element.getAttribute(ATT_TYPE), source);
        return false;
    }
    TypeDescriptor typeDescriptor = elementToInstanceDescriptorParser.parse(element, context).getTypeDescriptor();
    typeDescriptor.setDetailValue(META_MODEL, true);
    CustomStorageSystem customStorageSystem = CustomStorageSystem.class.cast(descriptorProvider);
    customStorageSystem.addTypeDescriptor(typeDescriptor);
    logger.info("Created meta model for {} and added it to {}.", typeDescriptor.getName(), source);
}