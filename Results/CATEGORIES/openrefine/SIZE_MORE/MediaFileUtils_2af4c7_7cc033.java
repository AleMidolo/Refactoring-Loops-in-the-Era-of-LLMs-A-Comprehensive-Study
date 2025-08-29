for (File chunk = path.readChunk(); chunk != null; chunk = path.readChunk()) {
    Map<String, String> parameters = new HashMap<>();
    parameters.put("action", "upload");
    parameters.put("token", getCsrfToken());
    parameters.put("stash", "1");
    parameters.put("filename", fileName);
    parameters.put("filesize", String.valueOf(path.getLength()));
    if (response == null) {
        parameters.put("offset", "0");
    } else {
        parameters.put("offset", String.valueOf(response.offset));
        parameters.put("filekey", response.filekey);
    }
    Map<String, ImmutablePair<String, java.io.File>> files = new HashMap<>();
    String chunkName = "chunk-" + i + path.getExtension();
    files.put("chunk", new ImmutablePair<String, File>(chunkName, chunk));
    response = uploadFile(parameters, files);
    chunk.delete();
    response.checkForErrors();
    double percent = (double) i / totalChunks * 100.0;
    logger.debug(i + "/" + totalChunks + " chunks uploaded (" + String.format("%.2f", percent) + " %).");
    i++;
}