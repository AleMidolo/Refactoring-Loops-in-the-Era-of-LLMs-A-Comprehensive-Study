sensors.stream()
       .map(sensor -> {
           Object[] row = newRow(executionModes.length + 1, table);
           row[0] = rowHeader(benchmarkResult.getBenchmark(), environmentName(benchmarkResult), sensor, sensors.size());
           SensorSummary sensorSummary = benchmarkResult.getSensorSummary(sensor);
           AtomicInteger index = new AtomicInteger(1);
           executionModes.forEach(mode -> {
               SensorResult sensorResult = sensorSummary.getResult(mode);
               row[index.get()] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
               index.getAndIncrement();
           });
           return row;
       })
       .collect(Collectors.toList());