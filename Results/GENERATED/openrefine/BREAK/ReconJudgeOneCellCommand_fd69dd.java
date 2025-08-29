newCell.recon.matchRank = IntStream.range(0, newCell.recon.candidates.size())
    .filter(m -> newCell.recon.candidates.get(m).id.equals(this.match.id))
    .findFirst()
    .ifPresent(m -> newCell.recon.matchRank = m);