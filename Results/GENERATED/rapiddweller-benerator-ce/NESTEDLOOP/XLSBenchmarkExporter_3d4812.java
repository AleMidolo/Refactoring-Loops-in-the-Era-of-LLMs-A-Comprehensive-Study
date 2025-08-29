result.getResults().stream()
    .flatMap(benchmarkResult -> benchmarkResult.getSensors().stream()
        .map(sensor -> {
            Object[] row = new Object[executionModes.length + 1];
            row[0] = rowHeader(benchmarkResult, sensor, benchmarkResult.getSensors().size());
            SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
            int[] i = {1};
            Arrays.stream(executionModes).forEach(mode -> {
                SensorResult sensorResult = sensorSummary.getResult(mode);
                row[i[0]] = (sensorResult != null ? sensorResult.entitiesPerHour() : "N/A");
                i[0]++;
            });
            addRow(row, rowHeadStyle, sheet);
            return row;
        }))
    .collect(Collectors.toList());