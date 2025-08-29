for (ComponentDescriptor component : parentType.getComponents()) {
    String componentName = component.getName();
    if (handledMembers.contains(componentName.toLowerCase())) {
        continue;
    }
    GenerationStep<?> componentGenerator = GenerationStepFactory.createGenerationStep(component, Uniqueness.NONE, iterationMode, childContext);
    statements.add(insertionIndex++, componentGenerator);
}