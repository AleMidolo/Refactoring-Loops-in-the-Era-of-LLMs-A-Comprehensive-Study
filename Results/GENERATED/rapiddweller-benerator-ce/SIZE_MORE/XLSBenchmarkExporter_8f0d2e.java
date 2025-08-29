sensors.stream()
    .map(sensor -> {
        Object[] row = new Object[executionModes.length + 1];
        row[0] = rowHeader(benchmarkResult, sensor, sensors.size());
        SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
        AtomicInteger i = new AtomicInteger(1);
        Arrays.stream(executionModes)
            .forEach(mode -> {
                SensorResult sensorResult = sensorSummary.getResult(mode);
                row[i.get()] = (sensorResult != null ? sensorResult.entitiesPerHour() : "N/A");
                i.getAndIncrement();
            });
        return row;
    })
    .forEach(row -> addRow(row, rowHeadStyle, sheet));