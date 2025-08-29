for (Metric metric : response.metrics()) {
    if (metric.metricName().contains("Requests")) {
        Map<String, Double> datapointMetrics = new HashMap<>();
        List<Datapoint> metrics = AWSUtils.getCloudwatchMetricStaleDataSum(regionID, "AWS/S3", metric.metricName(), dimensionList, clientCreator);
        for (Datapoint dp : metrics) {
            datapointMetrics.put(dp.timestamp().toString(), dp.sum());
        }
        requestMetrics.put(metric.metricName(), datapointMetrics);
    }
}