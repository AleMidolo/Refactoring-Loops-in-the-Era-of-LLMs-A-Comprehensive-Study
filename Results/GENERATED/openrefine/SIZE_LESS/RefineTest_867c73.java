importingJobs.stream()
    .map(ImportingJob::getId)
    .forEach(ImportingManager::disposeJob);