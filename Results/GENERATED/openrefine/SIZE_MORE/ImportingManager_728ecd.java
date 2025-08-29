keys.stream()
    .map(jobs::get)
    .filter(Objects::nonNull)
    .filter(job -> !job.updating && now - job.lastTouched > STALE_PERIOD)
    .forEach(job -> {
        job.dispose();
        keys.remove(job.getId());
        logger.info("Removed Stale Import Job ID " + job.getId());
    });