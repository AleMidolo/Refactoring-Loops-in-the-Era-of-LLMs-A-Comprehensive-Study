mappedResponsesToAdd.entrySet().stream()
    .map(responseToAdd -> {
        ObjectNode nodeToAdd = objectMapper.createObjectNode();
        if (responseToAdd.getValue() instanceof ToCopyableBuilder) {
            nodeToAdd.set(responseToAdd.getKey(), objectMapper.convertValue(((ToCopyableBuilder) responseToAdd.getValue()).toBuilder(), JsonNode.class));
        } else {
            nodeToAdd.set(responseToAdd.getKey(), objectMapper.convertValue(responseToAdd.getValue(), JsonNode.class));
        }
        return nodeToAdd;
    })
    .forEach(nodeToAdd -> payload = update(payload, nodeToAdd));