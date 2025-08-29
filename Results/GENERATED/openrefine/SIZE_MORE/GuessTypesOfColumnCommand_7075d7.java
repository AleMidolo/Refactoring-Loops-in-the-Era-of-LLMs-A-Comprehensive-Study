types.stream()
    .map(type -> {
        double score2 = score * (typeCount - types.indexOf(type)) / typeCount;
        return new AbstractMap.SimpleEntry<>(type, score2);
    })
    .forEach(entry -> {
        ReconType type = entry.getKey();
        double score2 = entry.getValue();
        if (map.containsKey(type.id)) {
            TypeGroup tg = map.get(type.id);
            tg.score += score2;
            tg.count++;
        } else {
            map.put(type.id, new TypeGroup(type.id, type.name, score2));
        }
    });