HttpHeadersSupport.getHttpHeaderLabels().stream()
    .forEach(headerLabel -> headersMap.put(headerLabel, HttpHeadersSupport.getHttpHeaderInfo(headerLabel));