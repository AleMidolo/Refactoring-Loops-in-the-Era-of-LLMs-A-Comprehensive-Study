counters.entrySet().stream()
    .filter(entry -> entry.getKey().startsWith("benchmark."))
    .forEach(entry -> {
        String key = entry.getKey();
        String sensor = "[" + (key.substring("benchmark.".length())) + "]";
        LatencyCounter latencyCount = entry.getValue();
        long latency = (latencyCount.totalLatency() > 0 ? latencyCount.totalLatency() : 1);
        long countUsed = latencyCount.sampleCount();
        long eps = countUsed * 1000 / latency;
        if (logger.isInfoEnabled()) {
            int threads = executionMode.getThreadCount();
            logger.info("{}: {} entities / {}, throughput {} E/s - {} ME/h, {}", 
                key, HF.format(countUsed), ElapsedTimeFormatter.format(latencyCount.totalLatency()), 
                HF.format(eps), PerformanceFormatter.format(eps * 3600. / 1000000.), 
                HF.pluralize(threads, "thread"));
        }
        result.add(new SensorResult(sensor, countUsed, executionMode, (int) latencyCount.totalLatency()));
    });