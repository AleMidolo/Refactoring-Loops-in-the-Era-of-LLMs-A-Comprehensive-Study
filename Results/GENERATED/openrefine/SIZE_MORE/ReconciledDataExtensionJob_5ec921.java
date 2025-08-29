ids.stream()
    .filter(id -> records.has(id) && records.get(id) instanceof ObjectNode)
    .map(id -> (ObjectNode) records.get(id))
    .map(record -> collectResult(record, reconCandidateMap))
    .filter(Objects::nonNull)
    .forEach(ext -> map.put(id, ext));