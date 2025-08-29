for (int r = 0; r < valueCount; r++) {
    line = reader.readLine();
    tuple.add((Serializable) ParsingUtilities.mapper.readValue(line, Object.class));
}