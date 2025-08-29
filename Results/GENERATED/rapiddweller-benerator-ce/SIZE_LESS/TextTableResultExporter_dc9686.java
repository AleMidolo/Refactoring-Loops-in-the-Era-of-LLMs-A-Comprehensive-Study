IntStream.range(0, executionModes.size())
         .forEach(i -> {
             ExecutionMode mode = executionModes.get(i);
             SensorResult sensorResult = sensorSummary.getResult(mode);
             row[i] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A");
         });