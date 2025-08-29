jobs.stream()
        .sorted(Comparator.comparingInt(job -> jobs.indexOf(job)).reversed())
        .forEach(job -> {
            Recon recon = jobs.indexOf(job) < recons.size() ? recons.get(jobs.indexOf(job)) : null;
            JobGroup group = jobToGroup.get(job);
            List<ReconEntry> entries = group.entries;
            jobToGroup.remove(job);
            jobs.remove(job);
            done++;
            if (recon != null) {
                recon.judgmentBatchSize = entries.size();
            }
            entries.stream()
                    .filter(entry -> recon != null)
                    .forEach(entry -> {
                        Cell oldCell = entry.cell;
                        Cell newCell = new Cell(oldCell.value, recon);
                        CellChange cellChange = new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
                        cellChanges.add(cellChange);
                    });
        });