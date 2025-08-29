IntStream.range(0, attributeCount)
    .mapToObj(i -> parser.getAttributeValue(i))
    .map(text -> trimStrings ? CharMatcher.whitespace().trimFrom(text) : text)
    .filter(text -> text.length() > 0 || storeEmptyStrings)
    .forEach(text -> addCell(project, thisColumnGroup, record, composeName(parser.getAttributePrefix(i), parser.getAttributeLocalName(i)), text, storeEmptyStrings, guessDataType));