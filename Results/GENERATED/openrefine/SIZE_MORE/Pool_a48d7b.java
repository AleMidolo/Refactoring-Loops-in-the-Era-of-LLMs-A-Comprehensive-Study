IntStream.range(0, count)
    .mapToObj(i -> reader2.readLine())
    .filter(line -> line != null)
    .map(ReconCandidate::loadStreaming)
    .filter(Objects::nonNull)
    .forEach(this::pool);