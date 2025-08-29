for (Datapoint dp : map) {
    datapointMetrics.put(dp.timestamp().toString(), dp.average());
}