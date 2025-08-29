fileRecords.stream()
    .filter(Objects::nonNull)
    .forEach(fileRecord -> {
        try {
            parseOneFile(project, metadata, job, fileRecord, rootColumnGroup, limit, options, exceptions, progress);
        } catch (IOException e) {
            exceptions.add(e);
        }
        
        if (limit > 0 && project.rows.size() >= limit) {
            throw new BreakIterationException();
        }
    });