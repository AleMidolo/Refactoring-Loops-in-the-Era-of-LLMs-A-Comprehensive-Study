fileRecords.stream()
    .map(i -> JSONUtilities.getObjectElement(fileRecords, i))
    .filter(record -> StringUtils.isBlank(ImportingUtilities.getEncoding(record)))
    .forEach(record -> {
        String location = JSONUtilities.getString(record, "location", null);
        if (location != null) {
            String detected = guessEncoding(job.getRawDataDir(), location);
            if (detected != null) {
                JSONUtilities.safePut(record, "encoding", detected);
            }
        }
    });