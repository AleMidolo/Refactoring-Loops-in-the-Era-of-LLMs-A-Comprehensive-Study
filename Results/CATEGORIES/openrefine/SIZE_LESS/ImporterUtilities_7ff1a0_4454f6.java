for (ObjectNode fileRecord : fileRecords) {
    File file = ImportingUtilities.getFile(job, fileRecord);
    totalSize += file.length();
}