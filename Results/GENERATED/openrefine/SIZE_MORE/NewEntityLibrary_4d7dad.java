project.rows.stream()
    .flatMap(row -> IntStream.range(0, row.cells.size())
        .mapToObj(i -> new AbstractMap.SimpleEntry<>(i, row.cells.get(i))))
    .filter(entry -> entry.getValue() != null && entry.getValue().recon != null)
    .forEach(entry -> {
        Recon recon = entry.getValue().recon;
        boolean changed = false;
        if (Recon.Judgment.New.equals(recon.judgment) && !reset && map.containsKey(recon.id)) {
            recon.judgment = Recon.Judgment.Matched;
            recon.match = new ReconCandidate(map.get(recon.id), entry.getValue().value.toString(), new String[0], 100);
            recon.addCandidate(recon.match);
            changed = true;
        } else if (Recon.Judgment.Matched.equals(recon.judgment) && reset && map.containsKey(recon.id)) {
            recon.judgment = Recon.Judgment.New;
            if (recon.candidates != null) {
                recon.candidates.remove(recon.candidates.size() - 1);
            }
            recon.match = null;
            changed = true;
        }
        if (changed) {
            impactedColumns.add(entry.getKey());
            Column column = project.columnModel.getColumnByCellIndex(entry.getKey());
            ReconConfig config = column.getReconConfig();
            if (config instanceof StandardReconConfig) {
                StandardReconConfig stdConfig = (StandardReconConfig) config;
                if (entry.getValue().getValue() instanceof String) {
                    stdConfig.computeFeatures(recon, (String) entry.getValue().getValue());
                }
            }
        }
    });