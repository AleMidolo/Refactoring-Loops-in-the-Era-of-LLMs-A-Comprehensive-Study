for (ToCopyableBuilder responseToAdd : responsesToAdd) {
    if (responseToAdd != null) {
        JsonNode jsonNode = AWSDiscoveryPlugin.MAPPER.convertValue(responseToAdd.toBuilder(), JsonNode.class);
        payload = update(payload, jsonNode);
    }
}