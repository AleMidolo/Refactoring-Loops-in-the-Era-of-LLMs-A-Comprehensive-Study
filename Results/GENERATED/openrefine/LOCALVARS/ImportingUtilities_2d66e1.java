ImportingManager.urlRewriters.stream()
        .map(rewriter -> rewriter.rewrite(urlString))
        .filter(Objects::nonNull)
        .forEach(result -> {
            urlString = result.rewrittenUrl;
            url = new URL(urlString);
            JSONUtilities.safePut(fileRecord, "url", urlString);
            JSONUtilities.safePut(fileRecord, "format", result.format);
            
            if (!result.download) {
                downloadCount++;
                JSONUtilities.append(fileRecords, fileRecord);
                return;
            }
        });