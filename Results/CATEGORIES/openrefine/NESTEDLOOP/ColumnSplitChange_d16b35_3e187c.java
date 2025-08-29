for (int i = 0; i < count; i++) {
    line = reader.readLine();
    if (line == null) {
        continue;
    }
    int valueCount = Integer.parseInt(line);
    List<Serializable> tuple = new ArrayList<Serializable>(valueCount);
    for (int r = 0; r < valueCount; r++) {
        line = reader.readLine();
        tuple.add((Serializable) ParsingUtilities.mapper.readValue(line, Object.class));
    }
    tuples.add(tuple);
}