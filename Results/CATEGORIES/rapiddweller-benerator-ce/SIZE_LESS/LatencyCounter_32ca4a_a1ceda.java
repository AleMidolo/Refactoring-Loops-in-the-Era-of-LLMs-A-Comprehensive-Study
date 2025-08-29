for (long value = minLatency(); value <= maxLatency; value++) {
    count += getLatencyCount(value);
    if (count >= targetCount)
        return value;
}