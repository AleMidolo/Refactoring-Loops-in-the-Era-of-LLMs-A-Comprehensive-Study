children.stream()
    .forEach(child -> {
        String nodeName = localName(child);
        
        switch (nodeName) {
            case ELEMENT:
                parseContainedElement(child, groupDescriptor);
                break;
            case SEQUENCE:
                parseSequence(child, groupDescriptor);
                break;
            case CHOICE:
                parseChoice(child, groupDescriptor);
                break;
            default:
                throw unsupportedElementType(child, choice);
        }
    });