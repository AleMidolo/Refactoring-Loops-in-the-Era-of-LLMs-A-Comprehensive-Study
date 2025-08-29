childElements.stream()
    .map(XMLUtil::localName)
    .map(childName -> {
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
        return instanceDescriptor;
    })
    .filter(Objects::nonNull)
    .map(instanceDescriptor -> GenerationStepFactory.createGenerationStep(instanceDescriptor, Uniqueness.NONE, iterationMode, childContext))
    .filter(Objects::nonNull)
    .forEach(statements::add);

interceptor.generationComplete(base, iterationMode, statements);
completionReported = true;
childElements.stream()
    .filter(child -> !EL_CONSUMER.equals(XMLUtil.localName(child)))
    .map(child -> parseContext.parseChildElement(child, parentXmlPath, statementPath))
    .forEach(statements::add);