for (HttpHeader header : _httpHeadersJson) {
    if (!isNullOrEmpty(header.name) && !isNullOrEmpty(header.value)) {
        headers.add(new BasicHeader(header.name, header.value));
    }
}