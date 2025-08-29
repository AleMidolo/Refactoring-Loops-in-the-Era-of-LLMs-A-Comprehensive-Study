for (ExecutionMode mode : executionModes) {
    SensorResult sensorResult = sensorSummary.getResult(mode);
    row[i] = (sensorResult != null ? sensorResult.entitiesPerHour() : "N/A");
    i++;
}