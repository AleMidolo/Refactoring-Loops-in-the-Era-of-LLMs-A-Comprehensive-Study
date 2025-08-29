for (InstanceDescriptor part : partsToGenerate) {
    if (!(part instanceof ComponentDescriptor) || part.getMode() != Mode.ignored && !ComplexTypeDescriptor.__SIMPLE_CONTENT.equals(part.getName())) {
        try {
            GenerationStep<Entity> step = (GenerationStep<Entity>) createGenerationStep(part, ownerUniqueness, iterationMode, context);
            if (step != null) {
                generationSteps.add(step);
            }
        } catch (Exception e) {
            throw BeneratorExceptionFactory.getInstance().configurationError("Error creating component builder for " + part, e);
        }
    }
}