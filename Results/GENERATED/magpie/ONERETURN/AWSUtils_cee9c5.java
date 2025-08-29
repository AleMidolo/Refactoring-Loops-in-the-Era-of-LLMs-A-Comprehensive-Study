mappedResponsesToAdd.entrySet().stream()
    .filter(entry -> !(entry.getValue() instanceof NullNode))
    .forEach(responseToAdd -> {
        ObjectNode nodeToAdd = AWSDiscoveryPlugin.MAPPER.createObjectNode();
        if (responseToAdd.getValue() instanceof ToCopyableBuilder) {
            nodeToAdd.set(responseToAdd.getKey(), AWSDiscoveryPlugin.MAPPER.convertValue(((ToCopyableBuilder) responseToAdd.getValue()).toBuilder(), JsonNode.class));
        } else {
            nodeToAdd.set(responseToAdd.getKey(), AWSDiscoveryPlugin.MAPPER.convertValue(responseToAdd.getValue(), JsonNode.class));
        }
        payload = update(payload, nodeToAdd);
    });