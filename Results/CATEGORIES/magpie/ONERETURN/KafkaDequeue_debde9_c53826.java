for (var r : records) {
    try {
        return Optional.of(MAPPER.readValue(r.value(), MagpieEnvelope.class));
    } catch (JsonProcessingException ex) {
        throw new FifoException("Couldn't deserialize envelope", ex);
    }
}