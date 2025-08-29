for (int i = 0; i < this.visitor.rows.size(); i++) {
    int rowSize = this.visitor.rows.get(i).size();
    List<Recon> recons = new ArrayList<Recon>(rowSize);
    for (int j = 0; j < rowSize; j++) {
        recons.add(null);
        if (j >= columnReconciled.size())
            columnReconciled.add(false);
    }
    reconList.add(recons);
}