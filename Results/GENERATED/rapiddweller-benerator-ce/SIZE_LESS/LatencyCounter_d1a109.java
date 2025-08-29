long count = LongStream.rangeClosed((long) latency + 1, maxLatency)
                         .mapToLong(this::getLatencyCount)
                         .sum();