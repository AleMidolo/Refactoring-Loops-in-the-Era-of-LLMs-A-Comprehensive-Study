for (LatencyCounter counter : sortedCounters) {
    list.add(new String[] { counter.getName() + ":", counter.totalLatency() + " ms total,", counter.sampleCount() + " inv,", df.format(counter.averageLatency()) + " ms/inv (avg.)" });
}