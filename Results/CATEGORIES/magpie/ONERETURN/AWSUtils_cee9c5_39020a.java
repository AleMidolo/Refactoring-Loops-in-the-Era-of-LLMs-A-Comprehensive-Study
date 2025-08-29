for (Map.Entry<String, Object> responseToAdd : mappedResponsesToAdd.entrySet()) {
    ObjectNode nodeToAdd = AWSDiscoveryPlugin.MAPPER.createObjectNode();
    final var value = responseToAdd.getValue();
    if (value instanceof NullNode) {
        return payload;
    }
    if (value instanceof ToCopyableBuilder) {
        nodeToAdd.set(responseToAdd.getKey(), AWSDiscoveryPlugin.MAPPER.convertValue(((ToCopyableBuilder) value).toBuilder(), JsonNode.class));
    } else {
        nodeToAdd.set(responseToAdd.getKey(), AWSDiscoveryPlugin.MAPPER.convertValue(value, JsonNode.class));
    }
    payload = update(payload, nodeToAdd);
}