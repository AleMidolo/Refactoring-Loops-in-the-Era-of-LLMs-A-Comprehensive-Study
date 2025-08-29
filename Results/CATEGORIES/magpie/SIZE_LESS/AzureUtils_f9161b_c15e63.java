for (Map.Entry<String, Object> responseToAdd : mappedResponsesToAdd.entrySet()) {
    ObjectNode nodeToAdd = AzureDiscoveryPlugin.MAPPER.createObjectNode();
    nodeToAdd.set(responseToAdd.getKey(), AzureDiscoveryPlugin.MAPPER.convertValue(responseToAdd.getValue(), JsonNode.class));
    payload = update(payload, nodeToAdd);
}