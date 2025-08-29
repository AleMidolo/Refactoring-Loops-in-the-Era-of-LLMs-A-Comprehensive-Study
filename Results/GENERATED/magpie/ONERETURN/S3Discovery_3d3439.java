allMetrics.stream()
        .filter(mc -> mc.filter() == null)
        .findFirst()
        .ifPresent(mc -> {
            JsonNode enhancedMetrics = discoverEnhancedCloudWatchMetrics(data, clientCreator, mc.id(), mapper, logger);
            AWSUtils.update(data.supplementaryConfiguration, Map.of("supportsStaleData", true));
            AWSUtils.update(data.supplementaryConfiguration, Map.of("staleDataMetrics", enhancedMetrics));
        });