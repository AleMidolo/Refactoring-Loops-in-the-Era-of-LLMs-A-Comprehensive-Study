jobs.stream()
    .map(job -> (StandardReconJob) job)
    .forEach(job -> {
        if (jobs.indexOf(job) > 0) {
            stringWriter.write(",");
        }
        stringWriter.write("\"q" + jobs.indexOf(job) + "\":");
        stringWriter.write(job.code);
    });