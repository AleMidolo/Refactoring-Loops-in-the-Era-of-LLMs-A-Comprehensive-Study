sensors.stream()
        .forEach(sensor -> {
            Object[] row = newRow(executionModes.length + 1, table);
            row[0] = rowHeader(benchmarkResult.getBenchmark(), environmentName(benchmarkResult), sensor, sensors.size());
            SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
            AtomicInteger i = new AtomicInteger(1);
            executionModes.stream()
                    .forEach(mode -> {
                        SensorResult sensorResult = sensorSummary.getResult(mode);
                        row[i.get()] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
                        i.getAndIncrement();
                    });
        });