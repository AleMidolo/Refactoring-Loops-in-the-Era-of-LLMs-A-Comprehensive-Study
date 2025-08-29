nodesToAdd.stream()
    .filter(Objects::nonNull)
    .forEach(nodeToAdd -> {
        try {
            if (payload != null) {
                payload = AWSDiscoveryPlugin.MAPPER.readerForUpdating(payload).readValue(nodeToAdd);
            } else {
                payload = nodeToAdd;
            }
        } catch (IOException e) {
            LOGGER.warn("Unable to add extra data {}", nodeToAdd, e);
        }
    });