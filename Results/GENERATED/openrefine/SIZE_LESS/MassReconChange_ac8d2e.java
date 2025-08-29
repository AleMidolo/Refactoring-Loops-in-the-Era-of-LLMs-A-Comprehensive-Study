IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .map(Recon::loadStreaming)
    .forEach(recon -> recons.put(recon.id, recon));