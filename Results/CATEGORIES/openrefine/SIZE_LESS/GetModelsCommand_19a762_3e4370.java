for (String headerLabel : HttpHeadersSupport.getHttpHeaderLabels()) {
    HttpHeaderInfo info = HttpHeadersSupport.getHttpHeaderInfo(headerLabel);
    headersMap.put(headerLabel, info);
}