for (int i = 0; i < fileRecords.size(); i++) {
    ObjectNode record = JSONUtilities.getObjectElement(fileRecords, i);
    String encoding = ImportingUtilities.getEncoding(record);
    if (StringUtils.isBlank(encoding)) {
        String location = JSONUtilities.getString(record, "location", null);
        if (location != null) {
            String detected = guessEncoding(job.getRawDataDir(), location);
            if (detected != null) {
                JSONUtilities.safePut(record, "encoding", detected);
            }
        }
    }
}