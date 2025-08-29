XMLUtil.getChildElements(element).stream()
    .forEach(child -> {
        String childType = XMLUtil.localName(child);
        if (EL_VARIABLE.equals(childType)) {
            modelParser.parseVariable(child);
        } else if (COMPONENT_TYPES.contains(childType)) {
            modelParser.getPartParser().parseComponentGeneration(child, (ComplexTypeDescriptor) type);
        } else if (EL_VALUE.equals(childType)) {
            modelParser.parseSimpleTypeArrayElement(child, (ArrayTypeDescriptor) type, valueCount++);
        } else if (EL_LIST.equals(childType)) {
            modelParser.getItemListParser().parse(child, (ComplexTypeDescriptor) type);
        }
    });