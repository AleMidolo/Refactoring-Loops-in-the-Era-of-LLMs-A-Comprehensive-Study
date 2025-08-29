Arrays.stream(executionModes)
      .map(mode -> sensorSummary.getResult(mode))
      .map(sensorResult -> sensorResult != null ? sensorResult.entitiesPerHour() : "N/A")
      .forEach(value -> row[i++] = value);