row.cells.stream()
    .filter(cell -> cell != null && cell.recon != null)
    .forEach(cell -> {
        Recon recon = cell.recon;
        boolean changed = false;
        if (Recon.Judgment.New.equals(recon.judgment) && !reset && map.containsKey(recon.id)) {
            recon.judgment = Recon.Judgment.Matched;
            recon.match = new ReconCandidate(map.get(recon.id), cell.value.toString(), new String[0], 100);
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
            impactedColumns.add(row.cells.indexOf(cell));
            Column column = project.columnModel.getColumnByCellIndex(row.cells.indexOf(cell));
            ReconConfig config = column.getReconConfig();
            if (config instanceof StandardReconConfig) {
                StandardReconConfig stdConfig = (StandardReconConfig) config;
                if (cell.getValue() instanceof String) {
                    stdConfig.computeFeatures(recon, (String) cell.getValue());
                }
            }
        }
    });