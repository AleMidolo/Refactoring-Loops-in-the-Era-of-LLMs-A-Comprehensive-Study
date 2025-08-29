for (ObjectNode fileRecord : fileRecords) {
    if (job.canceled) {
        break;
    }
    try {
        parseOneFile(project, metadata, job, fileRecord, limit, options, exceptions, progress);
    } catch (IOException e) {
        exceptions.add(e);
    }
    if (limit > 0 && project.rows.size() >= limit) {
        break;
    }
}