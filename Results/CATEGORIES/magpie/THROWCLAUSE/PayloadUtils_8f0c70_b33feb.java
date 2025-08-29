for (JsonNode nodeToAdd : nodesToAdd) {
    if (nodeToAdd != null) {
        try {
            if (payload != null) {
                payload = objectMapper.readerForUpdating(payload).readValue(nodeToAdd);
            } else {
                payload = nodeToAdd;
            }
        } catch (IOException e) {
            LOG.warn("Unable to add extra data {}", nodeToAdd, e);
        }
    }
}