path.readChunks()
        .map(chunk -> {
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
            files.put("chunk", new ImmutablePair<>(chunkName, chunk));
            response = uploadFile(parameters, files);
            chunk.delete();
            response.checkForErrors();
            double percent = (double) i / totalChunks * 100.0;
            logger.debug(i + "/" + totalChunks + " chunks uploaded (" + String.format("%.2f", percent) + " %).");
            i++;
            return null;
        }).collect(Collectors.toList());