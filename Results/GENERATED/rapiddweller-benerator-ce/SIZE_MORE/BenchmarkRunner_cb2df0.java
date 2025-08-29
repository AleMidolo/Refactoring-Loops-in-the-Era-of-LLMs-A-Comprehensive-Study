executionModes.stream()
    .filter(executionMode -> executionMode.isEe() || !benchmark.isReqEE())
    .forEach(executionMode -> {
        String filePath = benchmark.getFileName();
        List<SensorResult> results = runUntilMinDuration(filePath, environment, summary.getMinSecs(), initialCount, executionMode);
        results.forEach(result -> benchmarkResult.addResult(result));
        initialCount = results.get(0).getCount();
    });