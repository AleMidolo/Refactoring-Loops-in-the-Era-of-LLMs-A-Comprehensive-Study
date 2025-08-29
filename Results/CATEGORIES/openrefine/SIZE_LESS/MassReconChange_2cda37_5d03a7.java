for (Recon recon : recons.values()) {
    Pool pool = (Pool) options.get("pool");
    pool.poolReconCandidates(recon);
    ParsingUtilities.saveWriter.writeValue(writer, recon);
    writer.write("\n");
}