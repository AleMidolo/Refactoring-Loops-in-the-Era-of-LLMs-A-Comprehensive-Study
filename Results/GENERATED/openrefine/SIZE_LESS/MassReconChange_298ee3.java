IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .map(Recon::loadStreaming)
    .collect(Collectors.toMap(recon -> recon.id, recon -> recon));