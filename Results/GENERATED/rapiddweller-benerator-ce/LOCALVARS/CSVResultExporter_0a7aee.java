Arrays.fill(row, "N/A");

IntStream.range(0, executionModes.length)
    .forEach(i -> {
        ExecutionMode mode = executionModes[i];
        SensorResult sensorResult = sensorSummary.getResult(mode);
        row[i] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
    });