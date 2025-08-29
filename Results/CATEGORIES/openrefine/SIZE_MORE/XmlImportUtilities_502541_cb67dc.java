for (int i = 0; i < attributeCount; i++) {
    String text = parser.getAttributeValue(i);
    if (trimStrings) {
        text = CharMatcher.whitespace().trimFrom(text);
    }
    if (text.length() > 0 | !storeEmptyStrings) {
        addCell(project, thisColumnGroup, record, composeName(parser.getAttributePrefix(i), parser.getAttributeLocalName(i)), text, storeEmptyStrings, guessDataType);
    }
}