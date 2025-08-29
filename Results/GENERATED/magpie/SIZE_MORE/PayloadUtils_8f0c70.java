nodesToAdd.stream()
    .filter(Objects::nonNull)
    .forEach(nodeToAdd -> {
        try {
            payload = payload != null ? objectMapper.readerForUpdating(payload).readValue(nodeToAdd) : nodeToAdd;
        } catch (IOException e) {
            LOG.warn("Unable to add extra data {}", nodeToAdd, e);
        }
    });