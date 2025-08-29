IntStream.range(0, attributeCount)
    .mapToObj(i -> {
        String text = parser.getAttributeValue(i);
        if (trimStrings) {
            text = CharMatcher.whitespace().trimFrom(text);
        }
        return new AbstractMap.SimpleEntry<>(i, text);
    })
    .filter(entry -> entry.getValue().length() > 0 | !storeEmptyStrings)
    .forEach(entry -> addCell(project, thisColumnGroup, record, composeName(parser.getAttributePrefix(entry.getKey()), parser.getAttributeLocalName(entry.getKey())), entry.getValue(), storeEmptyStrings, guessDataType));