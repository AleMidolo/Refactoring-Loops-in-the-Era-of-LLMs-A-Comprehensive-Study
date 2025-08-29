sensors.stream()
    .map(sensor -> {
        Object[] row = new Object[executionModes.length + 1];
        row[0] = rowHeader(benchmarkResult, sensor, sensors.size());
        SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
        int[] i = {1};
        executionModes.forEach(mode -> {
            SensorResult sensorResult = sensorSummary.getResult(mode);
            row[i[0]] = (sensorResult != null ? sensorResult.entitiesPerHour() : "N/A");
            i[0]++;
        });
        return row;
    })
    .forEach(row -> addRow(row, rowHeadStyle, sheet));