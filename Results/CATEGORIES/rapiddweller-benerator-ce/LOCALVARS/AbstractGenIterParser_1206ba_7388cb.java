for (Element child : childElements) {
    String childName = XMLUtil.localName(child);
    InstanceDescriptor instanceDescriptor = null;
    if (EL_VARIABLE.equals(childName)) {
        instanceDescriptor = modelParser.parseVariable(child);
    } else if (COMPONENT_TYPES.contains(childName)) {
        PartParser partParser = new PartParser(modelParser, true);
        instanceDescriptor = partParser.parseComponentGeneration(child, (ComplexTypeDescriptor) type);
        handledMembers.add(instanceDescriptor.getName().toLowerCase());
    } else if (EL_VALUE.equals(childName)) {
        instanceDescriptor = modelParser.parseSimpleTypeArrayElement(child, (ArrayTypeDescriptor) type, arrayIndex++);
    } else if (EL_LIST.equals(childName)) {
        instanceDescriptor = modelParser.getItemListParser().parse(child, (ComplexTypeDescriptor) type);
    }
    if (instanceDescriptor != null) {
        GenerationStep<?> componentGenerator = GenerationStepFactory.createGenerationStep(instanceDescriptor, Uniqueness.NONE, iterationMode, childContext);
        if (componentGenerator != null) {
            statements.add(componentGenerator);
        }
    } else if (!EL_CONSUMER.equals(childName)) {
        interceptor.generationComplete(base, iterationMode, statements);
        completionReported = true;
        Statement subStatement = parseContext.parseChildElement(child, parentXmlPath, statementPath);
        statements.add(subStatement);
    }
}