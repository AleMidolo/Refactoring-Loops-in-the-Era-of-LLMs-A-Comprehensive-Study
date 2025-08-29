responsesToAdd.stream()
    .filter(Objects::nonNull)
    .map(responseToAdd -> objectMapper.convertValue(responseToAdd.toBuilder(), JsonNode.class))
    .forEach(jsonNode -> payload = update(payload, jsonNode));