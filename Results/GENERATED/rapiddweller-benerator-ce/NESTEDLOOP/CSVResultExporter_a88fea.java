Arrays.stream(sensors)
    .map(sensor -> {
        Object[] row = new Object[executionModes.length + 1];
        row[0] = rowHeader(benchmarkResult, sensor, sensors.size());
        SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
        IntWrapper index = new IntWrapper(1);
        Arrays.stream(executionModes)
            .forEach(mode -> {
                SensorResult sensorResult = sensorSummary.getResult(mode);
                row[index.getValue()] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
                index.increment();
            });
        return row;
    })
    .forEach(writer::writeRow);