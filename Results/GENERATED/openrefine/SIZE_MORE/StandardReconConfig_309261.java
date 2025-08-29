jobs.stream()
    .map(job -> (StandardReconJob)job)
    .forEach(job -> {
        Recon recon = null;
        String text = job.text;
        String key = "q" + jobs.indexOf(job);
        if (o.has(key) && o.get(key) instanceof ObjectNode) {
            ObjectNode o2 = (ObjectNode) o.get(key);
            if (o2.has("result") && o2.get("result") instanceof ArrayNode) {
                ArrayNode results = (ArrayNode) o2.get("result");
                recon = createReconServiceResults(text, results, historyEntryID);
            } else {
                recon = new Recon(historyEntryID, identifierSpace, schemaSpace);
                recon.error = "The service returned a JSON response without \"result\" field for query " + key;
                recon.judgment = Judgment.Error;
            }
        } else {
            recon = new Recon(historyEntryID, identifierSpace, schemaSpace);
            recon.error = "The service returned a JSON response without \"" + key + "\" field ";
            recon.judgment = Judgment.Error;
        }
        if (recon != null) {
            recon.service = service;
        }
        recons.add(recon);
    });