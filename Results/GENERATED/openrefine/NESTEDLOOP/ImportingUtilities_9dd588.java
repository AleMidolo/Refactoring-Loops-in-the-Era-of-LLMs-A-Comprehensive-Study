tempFiles.stream()
        .filter(fileItem -> !progress.isCanceled())
        .forEach(fileItem -> {
            InputStream stream = fileItem.getInputStream();
            String name = fileItem.getFieldName().toLowerCase();
            if (fileItem.isFormField()) {
                if (name.equals("clipboard")) {
                    String encoding = request.getCharacterEncoding();
                    if (encoding == null) {
                        encoding = "UTF-8";
                    }
                    File file = allocateFile(rawDataDir, "clipboard.txt");
                    ...
                } else if (name.equals("download")) {
                    String urlString = Streams.asString(stream).trim();
                    ...
                } else {
                    String value = Streams.asString(stream);
                    parameters.put(name, value);
                }
            } else {
                String fileName = fileItem.getName();
                if (fileName.length() > 0) {
                    long fileSize = fileItem.getSize();
                    File file = allocateFile(rawDataDir, fileName);
                    ...
                }
            }
            stream.close();
        });