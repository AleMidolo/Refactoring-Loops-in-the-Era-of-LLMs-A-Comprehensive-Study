result.getResults().stream()
    .flatMap(benchmarkResult -> benchmarkResult.getSensors().stream().map(sensor -> new AbstractMap.SimpleEntry<>(benchmarkResult, sensor)))
    .forEach(entry -> {
        BenchmarkResult benchmarkResult = entry.getKey();
        String sensor = entry.getValue();
        Object[] row = new Object[executionModes.length + 1];
        row[0] = rowHeader(benchmarkResult, sensor, benchmarkResult.getSensors().size());
        SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
        AtomicInteger i = new AtomicInteger(1);
        Arrays.stream(executionModes)
            .forEach(mode -> {
                SensorResult sensorResult = sensorSummary.getResult(mode);
                row[i.getAndIncrement()] = (sensorResult != null ? sensorResult.entitiesPerHour() : "N/A");
            });
        addRow(row, rowHeadStyle, sheet);
    });