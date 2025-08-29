fileRecords.stream()
    .limit(limit > 0 ? Math.min(limit, fileRecords.size()) : fileRecords.size())
    .forEach(fileRecord -> {
        try {
            parseOneFile(project, metadata, job, fileRecord, rootColumnGroup, limit, options, exceptions, progress);
        } catch (IOException e) {
            exceptions.add(e);
        }
        if (limit > 0 && project.rows.size() >= limit) {
            throw new RuntimeException(); 
        }
    });