Arrays.stream(executionModes)
      .map(mode -> sensorSummary.getResult(mode))
      .forEach(sensorResult -> row[i++] = (sensorResult != null ? PerformanceFormatter.format(sensorResult.entitiesPerHour()) : "N/A"));