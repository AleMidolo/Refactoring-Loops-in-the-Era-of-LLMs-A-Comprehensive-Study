IntStream.range(0, length)
    .mapToObj(i -> results.get(i))
    .map(ReconResult::toCandidate)
    .peek(candidate -> {
        if(autoMatch && i == 0 && candidate.match) {
            recon.match = candidate;
            recon.matchRank = 0;
            recon.judgment = Judgment.Matched;
            recon.judgmentAction = "auto";
        }
    })
    .forEach(recon::addCandidate);