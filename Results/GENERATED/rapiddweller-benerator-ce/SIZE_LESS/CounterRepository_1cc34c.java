sortedCounters.stream()
    .map(counter -> new String[] { counter.getName() + ":", counter.totalLatency() + " ms total,", counter.sampleCount() + " inv,", df.format(counter.averageLatency()) + " ms/inv (avg.)" })
    .forEach(list::add);