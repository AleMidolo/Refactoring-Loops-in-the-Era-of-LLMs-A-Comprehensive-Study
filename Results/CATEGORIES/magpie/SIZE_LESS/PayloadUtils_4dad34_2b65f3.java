for (ToCopyableBuilder responseToAdd : responsesToAdd) {
    if (responseToAdd != null) {
        JsonNode jsonNode = objectMapper.convertValue(responseToAdd.toBuilder(), JsonNode.class);
        payload = update(payload, jsonNode);
    }
}