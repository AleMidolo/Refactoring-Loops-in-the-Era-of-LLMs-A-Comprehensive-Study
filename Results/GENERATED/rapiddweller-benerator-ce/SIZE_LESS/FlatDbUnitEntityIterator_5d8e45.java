IntStream.range(0, columnCount)
    .forEach(i -> {
        columnNames[i] = reader.getAttributeLocalName(i);
        cellValues[i] = reader.getAttributeValue(i);
    });