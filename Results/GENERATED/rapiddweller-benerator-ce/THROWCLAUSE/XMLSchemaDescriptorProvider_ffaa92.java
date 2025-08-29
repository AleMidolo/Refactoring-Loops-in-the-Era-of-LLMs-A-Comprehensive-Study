children.stream()
    .map(child -> localName(child))
    .forEach(nodeName -> {
        if (ELEMENT.equals(nodeName)) {
            parseContainedElement(child, groupDescriptor);
        } else if (SEQUENCE.equals(nodeName)) {
            parseSequence(child, groupDescriptor);
        } else if (CHOICE.equals(nodeName)) {
            parseChoice(child, groupDescriptor);
        } else {
            throw unsupportedElementType(child, choice);
        }
    });