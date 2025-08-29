for (Long id : keys) {
    ImportingJob job = jobs.get(id);
    if (job != null && !job.updating && now - job.lastTouched > STALE_PERIOD) {
        job.dispose();
        jobs.remove(id);
        logger.info("Removed Stale Import Job ID " + id);
    }
}