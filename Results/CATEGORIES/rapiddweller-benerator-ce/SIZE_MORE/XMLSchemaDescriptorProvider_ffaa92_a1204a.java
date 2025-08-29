for (Element child : children) {
    String nodeName = localName(child);
    if (ELEMENT.equals(nodeName)) {
        parseContainedElement(child, groupDescriptor);
    } else if (SEQUENCE.equals(nodeName)) {
        parseSequence(child, groupDescriptor);
    } else if (CHOICE.equals(nodeName)) {
        parseChoice(child, groupDescriptor);
    } else {
        throw unsupportedElementType(child, choice);
    }
}