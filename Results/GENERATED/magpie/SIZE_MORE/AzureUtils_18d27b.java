nodesToAdd.stream()
        .filter(Objects::nonNull)
        .forEach(nodeToAdd -> {
            try {
                payload = (payload != null) ? AzureDiscoveryPlugin.MAPPER.readerForUpdating(payload).readValue(nodeToAdd) : nodeToAdd;
            } catch (IOException e) {
                LOGGER.warn("Unable to add extra data {}", nodeToAdd, e);
            }
        });