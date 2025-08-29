for (int i = 0; i < arrayType.getElementCount(); i++) {
    ArrayElementDescriptor element = getElementOfTypeOrParents(arrayType, i);
    if (element.getMode() != Mode.ignored) {
        Generator<?> generator = InstanceGeneratorFactory.createSingleInstanceGenerator(element, uniqueness, context);
        result[i] = generator;
    }
}