partsToGenerate.stream()
    .filter(part -> !(part instanceof ComponentDescriptor) || part.getMode() != Mode.ignored && !ComplexTypeDescriptor.__SIMPLE_CONTENT.equals(part.getName()))
    .map(part -> {
        try {
            return (GenerationStep<Entity>) createGenerationStep(part, ownerUniqueness, iterationMode, context);
        } catch (Exception e) {
            throw BeneratorExceptionFactory.getInstance().configurationError("Error creating component builder for " + part, e);
        }
    })
    .filter(Objects::nonNull)
    .forEach(generationSteps::add);