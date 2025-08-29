for (Map.Entry<String, Integer> entry : providerCountMap.entrySet()) {
    summaries.add(AggregateProviderSummary.of(entry.getKey(), entry.getValue()));
}