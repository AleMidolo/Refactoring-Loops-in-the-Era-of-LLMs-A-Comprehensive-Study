recon.matchRank = IntStream.range(0, recon.candidates.size())
    .filter(m -> recon.candidates.get(m).id.equals(_match.id))
    .findFirst().orElse(-1);