project.getRows().stream()
    .flatMap(row -> IntStream.range(0, row.getCells().size()).mapToObj(i -> new AbstractMap.SimpleEntry<>(i, row.getCells().get(i))))
    .filter(entry -> entry.getValue() != null && entry.getValue().getRecon() != null)
    .forEach(entry -> {
        Recon recon = entry.getValue().getRecon();
        boolean changed = false;
        if (Recon.Judgment.New.equals(recon.getJudgment()) && !reset && map.containsKey(recon.getId())) {
            recon.setJudgment(Recon.Judgment.Matched);
            recon.setMatch(new ReconCandidate(map.get(recon.getId()), entry.getValue().getValue().toString(), new String[0], 100));
            recon.addCandidate(recon.getMatch());
            changed = true;
        } else if (Recon.Judgment.Matched.equals(recon.getJudgment()) && reset && map.containsKey(recon.getId())) {
            recon.setJudgment(Recon.Judgment.New);
            if (recon.getCandidates() != null) {
                recon.getCandidates().remove(recon.getCandidates().size() - 1);
            }
            recon.setMatch(null);
            changed = true;
        }
        if (changed) {
            impactedColumns.add(entry.getKey());
            Column column = project.getColumnModel().getColumnByCellIndex(entry.getKey());
            ReconConfig config = column.getReconConfig();
            if (config instanceof StandardReconConfig) {
                StandardReconConfig stdConfig = (StandardReconConfig) config;
                if (entry.getValue().getValue() instanceof String) {
                    stdConfig.computeFeatures(recon, (String) entry.getValue().getValue());
                }
            }
        }
    });