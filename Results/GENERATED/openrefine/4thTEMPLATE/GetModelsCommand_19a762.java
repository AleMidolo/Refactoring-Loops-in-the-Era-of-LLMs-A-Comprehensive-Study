HttpHeadersSupport.getHttpHeaderLabels()
    .stream()
    .forEach(headerLabel -> {
        HttpHeaderInfo info = HttpHeadersSupport.getHttpHeaderInfo(headerLabel);
        headersMap.put(headerLabel, info);
    });