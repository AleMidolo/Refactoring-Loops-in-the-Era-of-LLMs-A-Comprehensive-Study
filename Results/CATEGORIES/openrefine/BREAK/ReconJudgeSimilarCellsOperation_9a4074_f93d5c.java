for (int m = 0; m < recon.candidates.size(); m++) {
    if (recon.candidates.get(m).id.equals(_match.id)) {
        recon.matchRank = m;
        break;
    }
}