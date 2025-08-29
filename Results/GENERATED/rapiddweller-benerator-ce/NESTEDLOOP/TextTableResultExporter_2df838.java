result.getResults().stream()
    .flatMap(benchmarkResult -> benchmarkResult.getSensors().stream().map(sensor ->
        newRow(executionModes.length + 1,table).apply(
            row -> {
                row[0] = rowHeader(benchmarkResult.getBenchmark(), environmentName(benchmarkResult), sensor, benchmarkResult.getSensors().size());
                SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
                int i = 1;
                for (ExecutionMode mode : executionModes) {
                    SensorResult sensorResult = sensorSummary.getResult(mode);
                    row[i] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
                    i++;
                }
            }))
    ).collect(Collectors.toList());