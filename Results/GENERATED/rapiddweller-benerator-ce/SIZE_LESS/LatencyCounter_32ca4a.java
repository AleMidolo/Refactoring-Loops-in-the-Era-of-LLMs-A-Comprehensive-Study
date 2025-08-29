return LongStream.rangeClosed(minLatency(), maxLatency)
    .mapToLong(this::getLatencyCount)
    .reduce(0, (sum, value) -> {
        if (sum >= targetCount) throw new RuntimeException();
        return sum + value;
    });