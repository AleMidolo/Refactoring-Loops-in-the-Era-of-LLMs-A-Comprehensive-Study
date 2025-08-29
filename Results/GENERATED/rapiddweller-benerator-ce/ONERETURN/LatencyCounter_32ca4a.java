return LongStream.iterate(minLatency(), val -> val + 1)
    .takeWhile(val -> val <= maxLatency)
    .mapToLong(this::getLatencyCount)
    .peek(count::add)
    .filter(val -> count.get() >= targetCount)
    .findFirst()
    .orElseThrow();