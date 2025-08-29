int result = sensorResults.stream()
    .skip(1)
    .mapToInt(SensorResult::getDuration)
    .min()
    .orElse(0);