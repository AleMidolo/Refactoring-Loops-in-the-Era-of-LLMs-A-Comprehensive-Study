for (Datapoint dp : metrics) {
    datapointMetrics.put(dp.timestamp().toString(), dp.sum());
}