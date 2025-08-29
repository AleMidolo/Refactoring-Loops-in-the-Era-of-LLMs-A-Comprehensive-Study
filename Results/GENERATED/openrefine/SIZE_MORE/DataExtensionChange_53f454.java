Arrays.stream(values)
    .forEach(value -> {
        Cell cell = null;
        if (value instanceof ReconCandidate) {
            ReconCandidate rc = (ReconCandidate) value;
            Recon recon = reconMap.containsKey(rc.id) ? reconMap.get(rc.id) :
                new Recon(_historyEntryID, _identifierSpace, _schemaSpace)
                .addCandidate(rc)
                .setService(_service)
                .setMatch(rc)
                .setMatchRank(0)
                .setJudgment(Judgment.Matched)
                .setJudgmentAction("auto")
                .setJudgmentBatchSize(1);
            reconMap.put(rc.id, recon);
            cell = new Cell(rc.name, recon);
        } else {
            cell = value == null ? null : new Cell((Serializable) value, null);
        }
        row.setCell(_firstNewCellIndex + c, cell);
    });