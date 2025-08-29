for (int j = 0; j < count; j++) {
    ReconResult result = reconResults.get(j);
    double score = 1.0 / (1 + j);
    List<ReconType> types = result.types;
    int typeCount = types.size();
    for (int t = 0; t < typeCount; t++) {
        ReconType type = types.get(t);
        double score2 = score * (typeCount - t) / typeCount;
        if (map.containsKey(type.id)) {
            TypeGroup tg = map.get(type.id);
            tg.score += score2;
            tg.count++;
        } else {
            map.put(type.id, new TypeGroup(type.id, type.name, score2));
        }
    }
}