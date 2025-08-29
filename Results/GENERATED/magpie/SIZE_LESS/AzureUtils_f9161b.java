mappedResponsesToAdd.entrySet().stream()
    .map(responseToAdd -> {
        ObjectNode nodeToAdd = AzureDiscoveryPlugin.MAPPER.createObjectNode();
        nodeToAdd.set(responseToAdd.getKey(), AzureDiscoveryPlugin.MAPPER.convertValue(responseToAdd.getValue(), JsonNode.class));
        return nodeToAdd;
    })
    .forEach(nodeToAdd -> payload = update(payload, nodeToAdd));