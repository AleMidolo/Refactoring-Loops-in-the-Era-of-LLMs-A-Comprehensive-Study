result.getResults().stream()
    .flatMap(benchmarkResult -> benchmarkResult.getSensors().stream()
        .map(sensor -> {
            Object[] row = newRow(executionModes.length + 1, table);
            row[0] = rowHeader(benchmarkResult.getBenchmark(), environmentName(benchmarkResult), sensor, benchmarkResult.getSensors().size());
            SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
            int[] i = {1};
            executionModes.stream()
                .forEach(mode -> {
                    SensorResult sensorResult = sensorSummary.getResult(mode);
                    row[i[0]++] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
                });
            return row;
        })
    ).collect(Collectors.toList());