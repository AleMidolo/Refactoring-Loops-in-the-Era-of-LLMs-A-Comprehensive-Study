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
            continue parts;
        }
    }
}