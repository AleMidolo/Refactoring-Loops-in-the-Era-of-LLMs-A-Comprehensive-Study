for (String sensor : sensors) {
    Object[] row = newRow(executionModes.length + 1, table);
    row[0] = rowHeader(benchmarkResult.getBenchmark(), environmentName(benchmarkResult), sensor, sensors.size());
    SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
    int i = 1;
    for (ExecutionMode mode : executionModes) {
        SensorResult sensorResult = sensorSummary.getResult(mode);
        row[i] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
        i++;
    }
}