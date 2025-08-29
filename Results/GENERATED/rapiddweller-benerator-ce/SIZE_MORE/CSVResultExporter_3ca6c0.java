result.getResults().stream()
    .flatMap(benchmarkResult -> benchmarkResult.getSensors().stream()
        .map(sensor -> {
            Object[] row = new Object[executionModes.length + 1];
            row[0] = rowHeader(benchmarkResult, sensor, benchmarkResult.getSensors().size());
            SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
            int i = 1;
            for (ExecutionMode mode : executionModes) {
                SensorResult sensorResult = sensorSummary.getResult(mode);
                row[i] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
                i++;
            }
            return row;
        }))
    .forEach(writer::writeRow);