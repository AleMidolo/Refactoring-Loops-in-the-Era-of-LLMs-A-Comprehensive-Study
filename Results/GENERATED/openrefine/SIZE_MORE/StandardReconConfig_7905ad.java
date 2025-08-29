results.stream()
        .map(ReconResult::toCandidate)
        .peek(candidate -> {
            if (autoMatch && results.indexOf(candidate) == 0 && candidate.match) {
                recon.match = candidate;
                recon.matchRank = 0;
                recon.judgment = Judgment.Matched;
                recon.judgmentAction = "auto";
            }
        })
        .forEach(recon::addCandidate);