IntStream.range(0, count)
    .mapToObj(i -> reader2.readLine())
    .filter(Objects::nonNull)
    .map(ReconCandidate::loadStreaming)
    .filter(Objects::nonNull)
    .forEach(this::pool);