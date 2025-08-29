newCell.recon.candidates.stream()
    .filter(candidate -> candidate.id.equals(this.match.id))
    .findFirst()
    .ifPresent(candidate -> newCell.recon.matchRank = newCell.recon.candidates.indexOf(candidate));