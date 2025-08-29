_httpHeadersJson.stream()
    .filter(header -> !isNullOrEmpty(header.name) && !isNullOrEmpty(header.value))
    .map(header -> new BasicHeader(header.name, header.value))
    .forEach(headers::add);