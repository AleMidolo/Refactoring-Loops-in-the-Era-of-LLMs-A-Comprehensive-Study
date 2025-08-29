result.getResults().forEach(benchmarkResult -> {
    benchmarkResult.getSensors().forEach(sensor -> {
        Object[] row = new Object[executionModes.length + 1];
        row[0] = rowHeader(benchmarkResult, sensor, benchmarkResult.getSensors().size());
        SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
        int i = 1;
        for (ExecutionMode mode : executionModes) {
            SensorResult sensorResult = sensorSummary.getResult(mode);
            row[i] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
            i++;
        }
        writer.writeRow(row);
    });
});