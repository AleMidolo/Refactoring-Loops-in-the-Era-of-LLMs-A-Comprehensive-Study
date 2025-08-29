Optional<MagpieEnvelope> optionalEnvelope = Arrays.stream(records)
        .map(r -> {
            try {
                return Optional.of(MAPPER.readValue(r.value(), MagpieEnvelope.class));
            } catch (JsonProcessingException ex) {
                throw new FifoException("Couldn't deserialize envelope", ex);
            }
        })
        .findFirst()
        .orElse(Optional.empty());