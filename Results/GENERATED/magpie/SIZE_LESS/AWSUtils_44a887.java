responsesToAdd.stream()
    .filter(Objects::nonNull)
    .map(responseToAdd -> AWSDiscoveryPlugin.MAPPER.convertValue(responseToAdd.toBuilder(), JsonNode.class))
    .forEach(jsonNode -> payload = update(payload, jsonNode));