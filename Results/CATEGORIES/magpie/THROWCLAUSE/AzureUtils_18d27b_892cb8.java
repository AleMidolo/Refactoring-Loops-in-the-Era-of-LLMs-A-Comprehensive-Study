for (JsonNode nodeToAdd : nodesToAdd) {
    if (nodeToAdd != null) {
        try {
            if (payload != null) {
                payload = AzureDiscoveryPlugin.MAPPER.readerForUpdating(payload).readValue(nodeToAdd);
            } else {
                payload = nodeToAdd;
            }
        } catch (IOException e) {
            LOGGER.warn("Unable to add extra data {}", nodeToAdd, e);
        }
    }
}