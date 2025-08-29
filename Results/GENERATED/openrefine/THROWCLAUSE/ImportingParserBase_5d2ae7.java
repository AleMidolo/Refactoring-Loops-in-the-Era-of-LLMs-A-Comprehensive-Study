fileRecords.stream()
    .takeWhile(fileRecord -> !job.canceled)
    .forEach(fileRecord -> {
        try {
            parseOneFile(project, metadata, job, fileRecord, limit, options, exceptions, progress);
        } catch (IOException e) {
            exceptions.add(e);
        }
        if (limit > 0 && project.rows.size() >= limit) {
            Thread.currentThread().stop(); // Stopping the loop
        }
    });