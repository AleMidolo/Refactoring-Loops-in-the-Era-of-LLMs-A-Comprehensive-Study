for (Map.Entry<String, LatencyCounter> entry : counters) {
    String key = entry.getKey();
    if (key.startsWith("benchmark.")) {
        String sensor = "[" + (key.substring("benchmark.".length())) + "]";
        LatencyCounter latencyCount = entry.getValue();
        long latency = (latencyCount.totalLatency() > 0 ? latencyCount.totalLatency() : 1);
        long countUsed = latencyCount.sampleCount();
        long eps = countUsed * 1000 / latency;
        if (logger.isInfoEnabled()) {
            int threads = executionMode.getThreadCount();
            if (logger.isInfoEnabled()) {
                logger.info("{}: {} entities / {}, throughput {} E/s - {} ME/h, {}", key, HF.format(countUsed), ElapsedTimeFormatter.format(latencyCount.totalLatency()), HF.format(eps), PerformanceFormatter.format(eps * 3600. / 1000000.), HF.pluralize(threads, "thread"));
            }
        }
        result.add(new SensorResult(sensor, countUsed, executionMode, (int) latencyCount.totalLatency()));
    }
}