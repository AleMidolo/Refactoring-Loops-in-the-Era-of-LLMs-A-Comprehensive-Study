for (int i = 0; i < length; i++) {
    ReconResult result = results.get(i);
    ReconCandidate candidate = result.toCandidate();
    if (autoMatch && i == 0 && result.match) {
        recon.match = candidate;
        recon.matchRank = 0;
        recon.judgment = Judgment.Matched;
        recon.judgmentAction = "auto";
    }
    recon.addCandidate(candidate);
}