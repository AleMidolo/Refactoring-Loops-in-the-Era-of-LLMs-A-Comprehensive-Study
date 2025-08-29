for (int m = 0; m < newCell.recon.candidates.size(); m++) {
    if (newCell.recon.candidates.get(m).id.equals(this.match.id)) {
        newCell.recon.matchRank = m;
        break;
    }
}