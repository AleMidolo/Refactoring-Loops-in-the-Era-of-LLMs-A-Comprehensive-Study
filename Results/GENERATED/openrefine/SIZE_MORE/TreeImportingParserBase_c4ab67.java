fileRecords.stream()
    .anyMatch(fileRecord -> {
        try {
            parseOneFile(project, metadata, job, fileRecord, rootColumnGroup, limit, options, exceptions, progress);
            return false;
        } catch (IOException e) {
            exceptions.add(e);
            return (limit > 0 && project.rows.size() >= limit);
        }
    });