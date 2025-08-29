jobs.stream()
        .sorted(Comparator.comparingInt(j -> jobs.indexOf(j)).reversed())
        .forEach(j -> {
            ReconJob job = j;
            Recon recon = jobs.indexOf(j) < recons.size() ? recons.get(jobs.indexOf(j)) : null;
            JobGroup group = jobToGroup.get(job);
            List<ReconEntry> entries = group.entries;
            jobToGroup.remove(job);
            jobs.remove(job);
            done++;
            if (recon != null) {
                recon.judgmentBatchSize = entries.size();
            }
            entries.forEach(entry -> {
                if (recon == null) {
                    Cell oldCell = entry.cell;
                    logger.warn("We have a null recon here" + " " + oldCell + " " + entry.rowIndex);
                    return;
                }
                Cell oldCell = entry.cell;
                Cell newCell = new Cell(oldCell.value, recon);
                CellChange cellChange = new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
                cellChanges.add(cellChange);
            });
        });