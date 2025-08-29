for (ExecutionMode executionMode : executionModes) {
    if (executionMode.isEe() || !benchmark.isReqEE()) {
        String filePath = benchmark.getFileName();
        List<SensorResult> results = runUntilMinDuration(filePath, environment, summary.getMinSecs(), initialCount, executionMode);
        for (SensorResult result : results) {
            benchmarkResult.addResult(result);
        }
        initialCount = results.get(0).getCount();
    }
}