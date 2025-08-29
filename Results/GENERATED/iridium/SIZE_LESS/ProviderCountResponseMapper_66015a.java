providerCountMap.entrySet().stream()
    .map(entry -> AggregateProviderSummary.of(entry.getKey(), entry.getValue()))
    .forEach(summaries::add);