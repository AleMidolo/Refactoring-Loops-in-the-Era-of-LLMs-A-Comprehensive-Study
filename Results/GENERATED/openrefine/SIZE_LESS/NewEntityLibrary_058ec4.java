project.rows.stream()
    .flatMap(row -> row.cells.stream()
        .filter(Objects::nonNull)
        .map(cell -> new AbstractMap.SimpleEntry<>(cell, row)))
    .filter(entry -> entry.getKey().recon != null)
    .forEach(entry -> {
        Cell cell = entry.getKey();
        Row row = entry.getValue();
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
            if (config instanceof StandardReconConfig && cell.getValue() instanceof String) {
                ((StandardReconConfig) config).computeFeatures(recon, (String) cell.getValue());
            }
        }
    });