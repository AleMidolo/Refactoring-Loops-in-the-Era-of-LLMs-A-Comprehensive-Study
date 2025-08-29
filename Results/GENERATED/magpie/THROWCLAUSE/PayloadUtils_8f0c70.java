nodesToAdd.stream()
    .filter(Objects::nonNull)
    .forEach(nodeToAdd -> {
        try {
            if (payload != null) {
                payload = objectMapper.readerForUpdating(payload).readValue(nodeToAdd);
            } else {
                payload = nodeToAdd;
            }
        } catch (IOException e) {
            LOG.warn("Unable to add extra data {}", nodeToAdd, e);
        }
});