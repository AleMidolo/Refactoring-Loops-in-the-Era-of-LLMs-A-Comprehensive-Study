response.metrics().stream()
    .filter(metric -> metric.metricName().contains("Requests"))
    .forEach(metric -> {
        Map<String, Double> datapointMetrics = new HashMap<>();
        List<Datapoint> metrics = AWSUtils.getCloudwatchMetricStaleDataSum(regionID, "AWS/S3", metric.metricName(), dimensionList, clientCreator);
        metrics.forEach(dp -> datapointMetrics.put(dp.timestamp().toString(), dp.sum()));
        requestMetrics.put(metric.metricName(), datapointMetrics);
    });