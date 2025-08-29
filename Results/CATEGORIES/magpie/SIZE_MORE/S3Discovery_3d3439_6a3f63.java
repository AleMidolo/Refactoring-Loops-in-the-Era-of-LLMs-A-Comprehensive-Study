for (MetricsConfiguration mc : allMetrics) {
    if (mc.filter() == null) {
        JsonNode enhancedMetrics = discoverEnhancedCloudWatchMetrics(data, clientCreator, mc.id(), mapper, logger);
        AWSUtils.update(data.supplementaryConfiguration, Map.of("supportsStaleData", true));
        AWSUtils.update(data.supplementaryConfiguration, Map.of("staleDataMetrics", enhancedMetrics));
        return;
    }
}