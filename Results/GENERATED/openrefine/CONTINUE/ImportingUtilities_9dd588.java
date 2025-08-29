tempFiles.stream()
    .filter(fileItem -> !progress.isCanceled())
    .forEach(fileItem -> {
        try (InputStream stream = fileItem.getInputStream()) {
            String name = fileItem.getFieldName().toLowerCase();
            if (fileItem.isFormField()) {
                if (name.equals("clipboard")) {
                    String encoding = request.getCharacterEncoding();
                    if (encoding == null) {
                        encoding = "UTF-8";
                    }
                    File file = allocateFile(rawDataDir, "clipboard.txt");
                    ObjectNode fileRecord = ParsingUtilities.mapper.createObjectNode();
                    JSONUtilities.safePut(fileRecord, "origin", "clipboard");
                    JSONUtilities.safePut(fileRecord, "declaredEncoding", encoding);
                    JSONUtilities.safePut(fileRecord, "declaredMimeType", (String) null);
                    JSONUtilities.safePut(fileRecord, "format", "text");
                    JSONUtilities.safePut(fileRecord, "fileName", "(clipboard)");
                    JSONUtilities.safePut(fileRecord, "location", getRelativePath(file, rawDataDir));
                    progress.setProgress("Uploading pasted clipboard text", calculateProgressPercent(update.totalExpectedSize, update.totalRetrievedSize));
                    JSONUtilities.safePut(fileRecord, "size", saveStreamToFile(stream, file, null));
                    JSONUtilities.append(fileRecords, fileRecord);
                    clipboardCount++;
                } else if (name.equals("download")) {
                    String urlString = Streams.asString(stream).trim();
                    URL url = new URL(urlString);
                    if (!allowedProtocols.contains(url.getProtocol().toLowerCase())) {
                        throw new IOException("Unsupported protocol: " + url.getProtocol());
                    }
                    ObjectNode fileRecord = ParsingUtilities.mapper.createObjectNode();
                    JSONUtilities.safePut(fileRecord, "origin", "download");
                    JSONUtilities.safePut(fileRecord, "url", urlString);
                    for (UrlRewriter rewriter : ImportingManager.urlRewriters) {
                        Result result = rewriter.rewrite(urlString);
                        if (result != null) {
                            urlString = result.rewrittenUrl;
                            url = new URL(urlString);
                            JSONUtilities.safePut(fileRecord, "url", urlString);
                            JSONUtilities.safePut(fileRecord, "format", result.format);
                            if (!result.download) {
                                downloadCount++;
                                JSONUtilities.append(fileRecords, fileRecord);
                                continue;
                            }
                        }
                    }
                    if ("http".equals(url.getProtocol()) || "https".equals(url.getProtocol())) {
                        final URL lastUrl = url;
                        final HttpClientResponseHandler<String> responseHandler = new HttpClientResponseHandler<String>() {

                            @Override
                            public String handleResponse(final ClassicHttpResponse response) throws IOException {
                                final int status = response.getCode();
                                if (status >= HttpStatus.SC_SUCCESS && status < HttpStatus.SC_REDIRECTION) {
                                    final HttpEntity entity = response.getEntity();
                                    if (entity == null) {
                                        throw new IOException("No content found in " + lastUrl.toExternalForm());
                                    }
                                    try {
                                        InputStream stream2 = entity.getContent();
                                        String mimeType = null;
                                        String charset = null;
                                        ContentType contentType = ContentType.parse(entity.getContentType());
                                        if (contentType != null) {
                                            mimeType = contentType.getMimeType();
                                            Charset cs = contentType.getCharset();
                                            if (cs != null) {
                                                charset = cs.toString();
                                            }
                                        }
                                        JSONUtilities.safePut(fileRecord, "declaredMimeType", mimeType);
                                        JSONUtilities.safePut(fileRecord, "declaredEncoding", charset);
                                        if (saveStream(stream2, lastUrl, rawDataDir, progress, update, fileRecord, fileRecords, entity.getContentLength())) {
                                            return "saved";
                                        }
                                    } catch (final IOException ex) {
                                        throw new ClientProtocolException(ex);
                                    }
                                    return null;
                                } else {
                                    throw new ClientProtocolException(String.format("HTTP error %d : %s for URL %s", status, response.getReasonPhrase(), lastUrl.toExternalForm()));
                                }
                            }
                        };
                        HttpClient httpClient = new HttpClient();
                        if (httpClient.getResponse(urlString, null, responseHandler) != null) {
                            archiveCount++;
                        }
                        downloadCount++;
                    } else {
                        URLConnection urlConnection = url.openConnection();
                        urlConnection.setConnectTimeout(5000);
                        urlConnection.connect();
                        InputStream stream2 = urlConnection.getInputStream();
                        JSONUtilities.safePut(fileRecord, "declaredEncoding", urlConnection.getContentEncoding());
                        JSONUtilities.safePut(fileRecord, "declaredMimeType", urlConnection.getContentType());
                        try {
                            if (saveStream(stream2, url, rawDataDir, progress, update, fileRecord, fileRecords, urlConnection.getContentLength())) {
                                archiveCount++;
                            }
                            downloadCount++;
                        } finally {
                            stream2.close();
                        }
                    }
                } else {
                    String value = Streams.asString(stream);
                    parameters.put(name, value);
                }
            } else {
                String fileName = fileItem.getName();
                if (fileName.length() > 0) {
                    long fileSize = fileItem.getSize();
                    File file = allocateFile(rawDataDir, fileName);
                    ObjectNode fileRecord = ParsingUtilities.mapper.createObjectNode();
                    JSONUtilities.safePut(fileRecord, "origin", "upload");
                    JSONUtilities.safePut(fileRecord, "declaredEncoding", request.getCharacterEncoding());
                    JSONUtilities.safePut(fileRecord, "declaredMimeType", fileItem.getContentType());
                    JSONUtilities.safePut(fileRecord, "fileName", fileName);
                    JSONUtilities.safePut(fileRecord, "location", getRelativePath(file, rawDataDir));
                    progress.setProgress("Saving file " + fileName + " locally (" + formatBytes(fileSize) + " bytes)", calculateProgressPercent(update.totalExpectedSize, update.totalRetrievedSize));
                    JSONUtilities.safePut(fileRecord, "size", saveStreamToFile(stream, file, null));
                    JSONUtilities.safePut(fileRecord, "format", guessBetterFormat(file, request.getCharacterEncoding(), "text"));
                    if (postProcessRetrievedFile(rawDataDir, file, fileRecord, fileRecords, progress)) {
                        archiveCount++;
                    }
                    uploadCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    });