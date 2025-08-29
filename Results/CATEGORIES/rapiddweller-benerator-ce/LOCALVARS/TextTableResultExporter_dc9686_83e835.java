for (ExecutionMode mode : executionModes) {
    SensorResult sensorResult = sensorSummary.getResult(mode);
    row[i] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
    i++;
}