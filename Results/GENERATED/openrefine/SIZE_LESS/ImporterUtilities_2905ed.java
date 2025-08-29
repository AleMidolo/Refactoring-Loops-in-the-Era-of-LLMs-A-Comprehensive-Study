long totalSize = fileRecords.stream()
    .map(fileRecord -> ImportingUtilities.getFile(job, fileRecord))
    .mapToLong(File::length)
    .sum();