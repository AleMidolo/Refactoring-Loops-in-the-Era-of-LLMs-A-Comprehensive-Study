for (int i = 0; i < columnCount; i++) {
    columnNames[i] = reader.getAttributeLocalName(i);
    cellValues[i] = reader.getAttributeValue(i);
}