parentType.getComponents().stream()
    .filter(component -> !handledMembers.contains(component.getName().toLowerCase()))
    .map(component -> GenerationStepFactory.createGenerationStep(component, Uniqueness.NONE, iterationMode, childContext))
    .forEach(componentGenerator -> statements.add(insertionIndex++, componentGenerator));